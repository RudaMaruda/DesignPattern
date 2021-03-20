package observer;

public class Animal extends Observer{
    @Override
    void update() {
        System.out.println("Notify animal");
    }
}
