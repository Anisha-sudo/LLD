package factoryDP.FactoryMethod.factory;

import factoryDP.FactoryMethod.Circle;
import factoryDP.FactoryMethod.Shape;

public class CircleFactory implements factory {
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
