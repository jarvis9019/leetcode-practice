package design.patterns.singleton;

public class DoubleCheckedSingleton {
    // volatile ensures visibility of changes across threads
    public static volatile DoubleCheckedSingleton INSTANCE;

    private  DoubleCheckedSingleton(){}

    public static DoubleCheckedSingleton getInstance(){
        if(INSTANCE == null){// First check (no locking)
            synchronized (DoubleCheckedSingleton.class){
                if(INSTANCE == null){// Second check (with locking)
                    INSTANCE = new DoubleCheckedSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
