import adapter.*;
import adapter.task.Adapter;
import adapter.task.AllToPdfAdapter;
import adapter.task.Converter;
import adapter.task.Pdf;
import adapter.task.convert.HtmlConverter;
import builder.Computer;
import builder.task.Pizza;
import builder.task.PizzaHomeTask;
import builder.task.Size;
import decorator.AbsCar;
import decorator.CarD;
import decorator.LeatherCocpit;
import decorator.VehicleD;
import decorator.task.Functionals;
import decorator.task.Internet;
import decorator.task.MultimediaBasic;
import decorator.task.Telephone;
import facade.User;
import facade.UserFacade;
import factory.*;
import factory_method.Car;
import factory_method.Vehicle;
import factory_method.VehicleFactory;
import factory_method.VehicleType;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {


        Computer computer = new Computer.ComputerBuilder("250GB", "8 GB")
                .setUSBEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        Computer computer2 = new Computer.ComputerBuilder("250GB", "8 GB")
                .setUSBEnabled(true)
                .build();

        System.out.println(computer);
        System.out.println(computer2);


        Pizza pizza1 = new Pizza.PizzaMaker("prosciutto,basil", "thin", "garlic sauce")
                .pizzaBuild();
        System.out.println(pizza1);

        Pizza pizza2 = new Pizza.PizzaMaker("marinare", "thin", "garlic sauce")
                .setDiameter(50)
                .setSpicy(true)
                .setWithoutRedSauce(false)
                .pizzaBuild();
        System.out.println(pizza2);

        PizzaHomeTask pizza3 = new PizzaHomeTask.PizzaBuilder("abhsb", "haved", "ad")
                .setSize(Size.SMALL)
                .setSpicy(true)
                .buildP();
        System.out.println(pizza3);

        PizzaHomeTask pizza4 = new PizzaHomeTask.PizzaBuilder("abhsb", "haved", "ad")
                .setSize(Size.LARGE)
                .setSpicy(true)
                .buildP();
        System.out.println(pizza4);

        AbstractFactory factory = FactoryProvider.getFactory(FactoryType.TWO_D_SHAPE_FACTORY);
        GeometricShape geometricShape = factory.getShape(ShapeType.CIRCLE);
        geometricShape.draw();


        AbstractFactory factory2 = FactoryProvider.getFactory(FactoryType.TWO_D_SHAPE_FACTORY);
        GeometricShapeArea geometricShape1 = (GeometricShapeArea) factory2.getShape(ShapeType.TRIANGLE);
        geometricShape1.draw();
        geometricShape1.getArea();


        AbstractFactory factory3 = FactoryProvider.getFactory(FactoryType.TWO_D_SHAPE_FACTORY);
        GeometricShapeArea geometricShape2 = (GeometricShapeArea) factory3.getShape(ShapeType.TRAPEZOID);
        geometricShape2.draw();
        geometricShape2.getPerimeter();
        geometricShape2.getArea();


//        Vehicle vehicle = VehicleFactory.getVehicle(VehicleType.MOTOCYCLE);
//        if (vehicle != null) {
//            vehicle.drive();
//        }

        // obiekt wejsciow
        Hdmi hdmi = new HdmiImpl();

        //obiekt wyjsciowy (docelowy) - na nim chcemy pracowac
        Usb usb = new Usb();

        //obiekt przejsciowy(adapter/konwerter)

        HdmiToUsb hdmiToUsb = new HdmiToUsbAdapter(hdmi);

        // wywolujemy metody z obiektu docelowego
        usb.connect(hdmiToUsb);

        /*-------------*/

        Converter converter = new HtmlConverter();
        //converter.convert();

        Pdf pdf = new Pdf();

        Adapter adapter = new AllToPdfAdapter(converter);

        pdf.convert(adapter);

        /*-------------*/

//        UserFacade userFacade = new UserFacade(null, null);
//        userFacade.register("Alex","Durand");
//        System.out.println();

        /*-------------*/

        VehicleD vehicle = new CarD();
        VehicleD vehicleLeather = new LeatherCocpit(vehicle);
        VehicleD vehicleLeatherWithAbs = new AbsCar(vehicleLeather);
        System.out.println(vehicleLeatherWithAbs.description());


        Functionals functionals = new MultimediaBasic();
        Functionals functionalsWithInternet = new Internet(functionals);
        Functionals functionalsWithInternetAndTelephone = new Telephone(functionalsWithInternet);

        System.out.println(functionals.description());
        System.out.println(functionalsWithInternet.description());
        System.out.println(functionalsWithInternetAndTelephone.description());







    }
}
