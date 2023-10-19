package FactoryDesignPattern;

public class ShapeFactory {

    Shape getShape(String shape){

        switch(shape){

            case "Circle":{
                return new Circle();
            }
            case "Rectangle": {
                return new Rectangle();
            }
            case "Square":{
                return new Square();
            }
            default : {
                return null;
            }
        }
    }
    
}
