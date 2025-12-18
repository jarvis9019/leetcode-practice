package design.patterns.singleton;

public enum EnumSingleton {
    INSTANCE;

    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void doSomething() {
        System.out.println("Enum Singleton in action");
    }
}

// Usage
// EnumSingleton.INSTANCE.doSomething();
