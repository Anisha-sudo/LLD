package factoryDP.FactoryMethod.factory;

import factoryDP.FactoryMethod.Shape;
import factoryDP.FactoryMethod.Square;

public class SquareFactory implements factory {

    @Override
    public Shape getShape() {
        return new Square();
    }
}
