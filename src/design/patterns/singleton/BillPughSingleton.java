package design.patterns.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {
    }

    // Static inner class - loaded only when getInstance() is called
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
