package singleton;

public class Application {

    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();

        System.out.println(eagerSingleton);
        System.out.println(eagerSingleton2);


        LazySingleton lazySingleton= LazySingleton.getInstance();
        LazySingleton lazySingleton2= LazySingleton.getInstance();

        System.out.println(lazySingleton);
        System.out.println(lazySingleton2);
    }
}
