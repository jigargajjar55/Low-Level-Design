package SingletonDesignPattern.EagerSingleton;

public class Client {

    public static void main(String[] args) {

        EagerSingletonDBConnection instance1 = EagerSingletonDBConnection.getInstance();
        EagerSingletonDBConnection instance2 = EagerSingletonDBConnection.getInstance();
        System.out.println(instance1.equals(instance2));
        
    }
    
}
