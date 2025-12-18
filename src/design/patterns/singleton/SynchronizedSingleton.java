package design.patterns.singleton;

public class SynchronizedSingleton {

    public static final SynchronizedSingleton INSTANCE=null;

    private SynchronizedSingleton(){

    }

    public static synchronized SynchronizedSingleton getInstance(){
        if(INSTANCE == null){
            return new SynchronizedSingleton();
        }
        return INSTANCE;
    }
}
