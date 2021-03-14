import builder.Computer;
import builder.task.Pizza;
import builder.task.PizzaHomeTask;
import builder.task.Size;
import factory.*;

public class Main {

    public static void main(String[] args) {


        Computer computer = new Computer.ComputerBuilder("250GB","8 GB")
                .setUSBEnabled(true)
                .setBluetoothEnabled(true)
                .build();

        Computer computer2 = new Computer.ComputerBuilder("250GB","8 GB")
                .setUSBEnabled(true)
                .build();

        System.out.println(computer);
        System.out.println(computer2);


        Pizza pizza1 = new Pizza.PizzaMaker("prosciutto,basil","thin","garlic sauce")
                .pizzaBuild();
        System.out.println(pizza1);

        Pizza pizza2 = new Pizza.PizzaMaker("marinare","thin","garlic sauce")
                .setDiameter(50)
                .setSpicy(true)
                .setWithoutRedSauce(false)
                .pizzaBuild();
        System.out.println(pizza2);

        PizzaHomeTask pizza3 = new PizzaHomeTask.PizzaBuilder("abhsb","haved","ad")
                .setSize(Size.SMALL)
                .setSpicy(true)
                .buildP();
        System.out.println(pizza3);

        PizzaHomeTask pizza4 = new PizzaHomeTask.PizzaBuilder("abhsb","haved","ad")
                .setSize(Size.LARGE)
                .setSpicy(true)
                .buildP();
        System.out.println(pizza4);

        AbstractFactory factory= FactoryProvider.getFactory(FactoryType.TWO_D_SHAPE_FACTORY);
        GeometricShape geometricShape = factory.getShape(ShapeType.CIRCLE);
        geometricShape.draw();

    }
}
