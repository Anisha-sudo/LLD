package factoryDP.SimpleFactory;

public class Main {

    public static void main(String args[]){

        ShapeFactory shapeFactory=new ShapeFactory();
        System.out.println((shapeFactory.getShape("square").getShape()));
    }
}
