package factoryDP.FactoryMethod;

import factoryDP.FactoryMethod.factory.ShapeFactory;

public class Main {

    public static void main(String[] args) {

        ShapeFactory obj=new ShapeFactory();
        System.out.println(obj.getfactory("circle").getShape());
    }
}
