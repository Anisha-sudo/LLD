package factoryDP.FactoryMethod.factory;

import factoryDP.FactoryMethod.Shape;

public class ShapeFactory {

    public Shape getfactory(String type){
        if(type.equals("circle")){
            CircleFactory circleFactory = new CircleFactory();
            return circleFactory.getShape();
        }else {
            SquareFactory squareFactory= new SquareFactory();
            return squareFactory.getShape();
        }
    }

}
