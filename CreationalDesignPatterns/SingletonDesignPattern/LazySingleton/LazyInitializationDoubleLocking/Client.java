package SingletonDesignPattern.LazySingleton.LazyInitializationDoubleLocking;

public class Client {

    public static void main(String[] args) {

        // LazyInitializationDBConnection instance1 = LazyInitializationDBConnection.getInstance();
        // LazyInitializationDBConnection instance2 = LazyInitializationDBConnection.getInstance();
        // System.out.println(instance1 == instance2);

        LazySingletonDBConnectionIODH obj = LazySingletonDBConnectionIODH.getInstance();
        System.out.println("Done!");

        // LazySingletonDBConnectionIODH instance3 = LazySingletonDBConnectionIODH.getInstance();
        // LazySingletonDBConnectionIODH instance4 = LazySingletonDBConnectionIODH.getInstance();
        // System.out.println(instance3 == instance4);

    }

}
