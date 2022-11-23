package head_first_design_pattern.ch05singleton;

public enum SingletonEnum {
    UNIQUE_INSTANCE;
}

class SingletonClient {
    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.UNIQUE_INSTANCE;
    }
}
