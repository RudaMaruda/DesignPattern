package strategy.task;

public class CalculateContext {

    private CalculateStrategy calculateStrategy;

    public CalculateContext setCalculateStrategy(CalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
        return this;
    }

    public float calculate(int x, int y){
        return calculateStrategy.calculate(x,y);
    }
}
