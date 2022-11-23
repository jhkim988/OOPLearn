package head_first_design_pattern.ch05singleton;

public class SingletonSynchronized {
    private static SingletonSynchronized uniqueInstance;

    private SingletonSynchronized() { }

    // 1. 성능 저하 있을 수 있다.
    // 2. Lazy Instantiation 을 포기한다. (초기화 시에 바로 값 넣어준다.)
    public static synchronized SingletonSynchronized getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonSynchronized();
        }
        return uniqueInstance;
    }

    // 3. DCL(Double-Checked Locking) 을 사용한다. volatile 키워드
    // volatile: cpu 캐싱 이용하지 않고, 공유 메모리에서 직접 접근
    private volatile static SingletonSynchronized instance;
    public static SingletonSynchronized getInstance_instance() {
        if (instance == null) {
            synchronized (SingletonSynchronized.class) {
                if (instance == null) {
                    instance = new SingletonSynchronized();
                }
            }
        }
        return instance;
    }
}
