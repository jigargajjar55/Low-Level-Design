package SOLID.InterfaceSegmentedPrinciple;

//I :- Interfaces Segmented Principle
//Interfaces should be such that class should not implement unnecessary functions they do not need

/*

Signs of Interface Pollution

- Classes have empty method implementations
- Method implementations throw UnsupportedOperationException (or similar)
- Method implementations return null or default/dummy values




*/



public class InterfaceSegmentedPrinciple {

    //This example contain one interface which have 3 methods.
    interface RestaurantEmployee{
        void washDishes();
        void serveCustomers();
        void cookFood();
    }

    //Waiter class implement interface in which 2 methods is unnecessary to implements
    //So it's not follow Interfaces Segmented Principle.
    class Waiter0 implements RestaurantEmployee{

        @Override
        public void cookFood() {
            //Not my Job            
        }

        @Override
        public void serveCustomers() {
            // It's my job.
            System.out.println("Serving the Customer");            
        }

        @Override
        public void washDishes() {
            //Not my Job                
        }
        
    }




    //This example follow Interfaces Segmented Principle.
    //Design interfaces such way that class should not implement unnecessary methods
    interface WaiterInterface{
        void serveCustomers();
        void takeOrder();
    }
    interface ChefInterface{
        void cookFood();
        void decideMenu();
    }

    class Waiter implements WaiterInterface{

        @Override
        public void serveCustomers() {
            System.out.println("Serving the customer");
            
        }

        @Override
        public void takeOrder() {
            System.out.println("Take the Order");
            
        }
        
    }

    class Chef implements ChefInterface{

        @Override
        public void cookFood() {
            System.out.println("Cook the Food!");
            
        }

        @Override
        public void decideMenu() {
            System.out.println("Decide the Menu!");
            
        }
        
    }
    
}
