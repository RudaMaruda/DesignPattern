package strategy.task;

public class DividingNumber implements CalculateStrategy{
    @Override
    public float calculate(int x, int y) {
        return x/y;
    }
}
