package singleton;

public class BillPughSingleton {
    // private constructor
    private BillPughSingleton(){}


    private static class BillPughSingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();


    }


    public static BillPughSingleton getInstance(){
        return BillPughSingletonHelper.INSTANCE;
    }


}
