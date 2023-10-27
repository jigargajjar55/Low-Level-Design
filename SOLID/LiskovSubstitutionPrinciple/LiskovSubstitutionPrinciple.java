package SOLID.LiskovSubstitutionPrinciple;

//L :- Liskov Substitution Principle
//If class B is subclass of class A, then we should be able to replace object of A with B without
// breaking the behaviour of the program.
//Subclass should be extend the capability of parent class not narrow it down.

public class LiskovSubstitutionPrinciple {

    interface Bike {
        void turnOnEngine();

        void accelerate();
    }

    class MotorCycle implements Bike {
        boolean isEngineOn;
        int speed;

        public void turnOnEngine() {
            // turn on the engine
            this.isEngineOn = true;
        }

        public void accelerate() {
            this.speed = this.speed * 10;
        }
    }

    //Here, It doesn't extend the capability of parent class. It doesn't follow Liskov Substitution. 
    //It will break our functionality
    class Bicycle implements Bike {
        public void turnOnEngine() {
            throw new AssertionError("There is no Engine");
        }

        public void accelerate() {
            // do something
        }

    }
}
