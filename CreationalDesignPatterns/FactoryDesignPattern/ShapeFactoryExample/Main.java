package FactoryDesignPattern.ShapeFactoryExample;

//Factory Pattern

/*
 
When we have to create object based on some conditions/business logic, 
we can use Factory design Pattern


 */

public class Main {

    public static void main(String[] args) {

        ShapeFactory shapeFactoryObj = new ShapeFactory();

        Shape shapeObj = shapeFactoryObj.getShape("Rectangle");

        shapeObj.draw();
    }

}
