package SingletonDesignPattern.LazySingleton.LazyInitializationDoubleLocking;

/**
 * Singleton pattern using lazy initialization holder class. This ensures that,
 * we have a lazy initialization
 * without worrying about synchronization.
 */
public class LazySingletonDBConnectionIODH {

    private LazySingletonDBConnectionIODH() {
        System.out.println("In LazySingletonDBConnectionIODH singleton");

    }

    private static class RegisteryHolder {
        static LazySingletonDBConnectionIODH INSTANCE = new LazySingletonDBConnectionIODH();
    }

    public static LazySingletonDBConnectionIODH getInstance() {
        return RegisteryHolder.INSTANCE;
    }

}
