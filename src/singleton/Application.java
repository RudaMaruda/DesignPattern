package singleton;

import singleton.task.LEVEL;
import singleton.task.LoggerBillPugh;
import singleton.task.LoggerLazy;

public class Application {

    public static void main(String[] args) {
//        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
//        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
//
//        System.out.println(eagerSingleton);
//        System.out.println(eagerSingleton2);
//
//
//        LazySingleton lazySingleton= LazySingleton.getInstance();
//        LazySingleton lazySingleton2= LazySingleton.getInstance();
//
//        System.out.println(lazySingleton);
//        System.out.println(lazySingleton2);
//
//        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
//        enumSingleton.setValue(10);
//        System.out.println(enumSingleton.getValue());
//
//        BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();
//        BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();
//        System.out.println(billPughSingleton);
//        System.out.println(billPughSingleton2);
//
//
//

        LoggerLazy loggerLazy = LoggerLazy.getInstance();

        loggerLazy.log(LEVEL.INFO, "test laxy info");

        LoggerBillPugh loggerBillPugh=LoggerBillPugh.getInstance();
   loggerBillPugh.log(LEVEL.ERROR,"Error in Bill Pugh");

    }
}
