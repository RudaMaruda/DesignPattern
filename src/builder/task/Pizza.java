package builder.task;

public class Pizza {
    private String ingrediens;
    private String dough;
    private String sauce;
    private boolean isWithoutRedSauce;
    private boolean isSpicy;
    private int diameter;





    public Pizza(PizzaMaker pizzaMaker){

        this.ingrediens = pizzaMaker.ingrediens;
        this.dough = pizzaMaker.dough;
        this.sauce = pizzaMaker.sauce;
        this.isWithoutRedSauce = pizzaMaker.isWithoutRedSauce;
        this.isSpicy=pizzaMaker.isSpicy;
        this.diameter=pizzaMaker.diameter;
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

    @Override
    public String toString() {
        return "Pizza{" +
                "ingrediens='" + ingrediens + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", isWithoutRedSauce=" + isWithoutRedSauce +
                ", isSpicy=" + isSpicy +
                ", diameter=" + diameter +
                " cm}";
    }



    public static class PizzaMaker{

        private String ingrediens;
        private String dough;
        private String sauce;
        private boolean isWithoutRedSauce;
        private boolean isSpicy;
        private int diameter;




        public PizzaMaker(String ingradiens, String dough, String sauce) {
            this.ingrediens = ingradiens;
            this.dough = dough;
            this.sauce = sauce;
        }

        public PizzaMaker setWithoutRedSauce(boolean withoutRedSauce) {
            isWithoutRedSauce = withoutRedSauce;
            return this;
        }

        public PizzaMaker setSpicy(boolean spicy) {
            isSpicy = spicy;
            return this;
        }

        public PizzaMaker setDiameter(int diameter) {
            this.diameter = diameter;
            return this;
        }

        public Pizza pizzaBuild(){
            return new Pizza(this);
        }
    }
}
