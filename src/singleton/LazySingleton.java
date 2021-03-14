package singleton;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    // without synchronized - Lazy singleton
    // with synchronized - Lazy Thread Safe Singleton
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
