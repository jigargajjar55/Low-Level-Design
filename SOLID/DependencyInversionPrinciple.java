package SOLID;

//D :- Dependency Inversion Principle
//Class should depends on interfaces rather than concrete Class.

public class DependencyInversionPrinciple {

    //In this example, It doesn't depends on interfaces, It depends on Concrete class in Macbook which restrict flexibilty of Class.

    interface Keyboard{
        void typeSpeed();
    }
    interface Mouse{
        void clickSpeed();
    }

    class WiredKeyboard implements Keyboard{

        @Override
        public void typeSpeed() {
            System.out.println("Good Speed");            
        }      
        
    }

    class WiredMouse implements Mouse{

        @Override
        public void clickSpeed() {
            System.out.println("Good Speed");
            
        }
        
    }

    class MacBook0{
        private final WiredKeyboard keyboard;
        private final WiredMouse mouse;

        public MacBook0(){
            this.keyboard = new WiredKeyboard();
            this.mouse = new WiredMouse();
        }
    }



    //Here we depends on interface rather than Concrete class
    //We took Interface object rather than class object
    //We pass class object using Constructer Injection
    //If we pass WiredKeyboad, bluetoothmouse, it will accept it as we accept interface object.
    //Not concrete class object
    class MacBook{
        private final Keyboard keyboard;
        private final Mouse mouse;

        public MacBook(Keyboard keyboard, Mouse mouse){
            this.keyboard = keyboard;
            this.mouse = mouse;
        }
    }
}
