package SingletonDesignPattern.LazySingleton.LazyInitialization;

public class Client {

    public static void main(String[] args) {

        LazyInitializationDBConnection instance1 = LazyInitializationDBConnection.getInstance();
        LazyInitializationDBConnection instance2 = LazyInitializationDBConnection.getInstance();

        System.out.println(instance1.equals(instance2));
    }

}
