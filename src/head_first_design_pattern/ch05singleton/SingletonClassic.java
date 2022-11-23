package head_first_design_pattern.ch05singleton;

public class SingletonClassic {
    private static SingletonClassic uniqueInstance;
    private SingletonClassic() { }

    public static SingletonClassic getInstance() {
        if (uniqueInstance == null) {
            return uniqueInstance = new SingletonClassic();
        }
        return uniqueInstance;
    }
}
