package factory;

public class FactoryProvider {

    public static AbstractFactory getFactory(FactoryType factoryType){
        if (FactoryType.TWO_D_SHAPE_FACTORY==factoryType){
            return new TwoDShapeFactory();
        } else if(FactoryType.TREE_D_SHAPE_FACTORY==factoryType){
            return null;
        }
        return null;
    }
}
