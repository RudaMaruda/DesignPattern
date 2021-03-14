package builder.task;

public class PizzaHomeTask {
    private String ingrediens;
    private String dough;
    private String sauce;
    private boolean isWithoutRedSauce;
    private boolean isSpicy;
    private int diameter;
    private Size size;
    private int diameterCM;

    private PizzaHomeTask(PizzaBuilder pizzaBuilder){
        this.ingrediens= pizzaBuilder.ingrediens;
        this.dough=pizzaBuilder.dough;
        this.sauce= pizzaBuilder.sauce;
        this.isWithoutRedSauce=pizzaBuilder.isWithoutRedSauce;
        this.isSpicy=pizzaBuilder.isSpicy;
        this.diameter= pizzaBuilder.diameter;
        this.size=pizzaBuilder.size;
        this.diameterCM=pizzaBuilder.diameterCM;
    }



    public String getIngrediens() {
        return ingrediens;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public boolean isWithoutRedSauce() {
        return isWithoutRedSauce;
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public int getDiameter() {
        return diameter;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "PizzaHomeTask{" +
                "ingrediens='" + ingrediens + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", isWithoutRedSauce=" + isWithoutRedSauce +
                ", isSpicy=" + isSpicy +
                ", size=" + size +
                ", diameterCM = "+ diameterCM+'}';
    }


    public static class PizzaBuilder{

        private String ingrediens;
        private String dough;
        private String sauce;
        private boolean isWithoutRedSauce;
        private boolean isSpicy;
        private int diameter;
        private Size size;
        private int diameterCM;

        public PizzaBuilder(String ingrediens, String dough, String sauce) {
            this.ingrediens = ingrediens;
            this.dough = dough;
            this.sauce = sauce;
        }

        public PizzaBuilder setWithoutRedSauce(boolean withoutRedSauce) {
            isWithoutRedSauce = withoutRedSauce;
            return this;
        }

        public PizzaBuilder setSpicy(boolean spicy) {
            isSpicy = spicy;
            return this;
        }

        public PizzaBuilder setDiameter(int diameter) {
            this.diameter = diameter;
            return this;
        }

        public PizzaBuilder setSize(Size size) {

            this.size = size;
           diameterCM = Size.displayCM(size);

            return this;
        }

        public PizzaHomeTask buildP(){
            return new PizzaHomeTask(this);
        }
    }
}
