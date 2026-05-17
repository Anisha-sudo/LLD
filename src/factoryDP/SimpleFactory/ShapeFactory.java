package factoryDP.SimpleFactory;

public class ShapeFactory {

    Shape getShape(String type){
        if(type.equals("circle")){
            return new Circle();
        }else {
            return new Square();
        }
    }

}
