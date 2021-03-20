package strategy.task;

public class AddingNumber implements CalculateStrategy{
    @Override
    public float calculate(int x, int y) {
        return x+y;
    }
}
