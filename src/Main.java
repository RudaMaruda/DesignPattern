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
import factory.*;
import observer.Animal;
import observer.Observable;
import observer.PersonO;
import strategy.CompresionContext;
import strategy.Zip;
import strategy.task.AddingNumber;
import strategy.task.CalculateContext;
import strategy.task.DividingNumber;
import university.Person;
import university.PersonFacade;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
        System.out.println();

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
        System.out.println();


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
        System.out.println();

        /*-------------*/

        Converter converter = new HtmlConverter();
        //converter.convert();

        Pdf pdf = new Pdf();

        Adapter adapter = new AllToPdfAdapter(converter);

        pdf.convert(adapter);
        System.out.println();

        /*-------------*/

//        UserFacade userFacade = new UserFacade(null, null);
//        userFacade.register("Alex","Durand");
//        System.out.println();

        /*-------------*/

        VehicleD vehicle = new CarD();
        VehicleD vehicleLeather = new LeatherCocpit(vehicle);
        VehicleD vehicleLeatherWithAbs = new AbsCar(vehicleLeather);
        System.out.println(vehicleLeatherWithAbs.description());
        System.out.println();

        /*-------------*/

        Functionals functionals = new MultimediaBasic();
        Functionals functionalsWithInternet = new Internet(functionals);
        Functionals functionalsWithInternetAndTelephone = new Telephone(functionalsWithInternet);

        System.out.println(functionals.description());
        System.out.println(functionalsWithInternet.description());
        System.out.println(functionalsWithInternetAndTelephone.description());
        System.out.println();

        /*-------------*/

        CompresionContext context = new CompresionContext();
        context.setCompressionStrategy(new Zip());

        List<File> fileToCompress = new ArrayList<File>();
        File exampleFile = new File("exampleFile");
        fileToCompress.add(exampleFile);

        context.createArchieve(fileToCompress);
        System.out.println();


        /*-------------*/

        CalculateContext calculateContext = new CalculateContext();
        String operator = "+";
        int x=10;
        int y = 15;

        if ("+".equals(operator)) {
            calculateContext.setCalculateStrategy(new AddingNumber());

        } else if ("/".equals(operator)){
            calculateContext.setCalculateStrategy(new DividingNumber());
        }

        System.out.println(calculateContext.calculate(x,y));
        System.out.println();

        /*-------------*/

        Observable observable = new Observable();
        observable.attach(new PersonO());
        observable.attach(new Animal());
        observable.notifyObserver();
        /*-------------*/
        PersonFacade personFacade = new PersonFacade();
        List<Person> personList = new LinkedList<>();
        personList.add(personFacade.addStudent("Alex","Zrezly","Java"));
        personList.add(personFacade.addTeacher("Fred","Honsley",List.of("java","JavaScript")));

        personFacade.displaySurNameSorted(personList);
    }
}
