package SingletonDesignPattern.EagerSingleton;

public class EagerSingletonDBConnection{

    private static final EagerSingletonDBConnection INSTANCE = new EagerSingletonDBConnection();

    private EagerSingletonDBConnection(){
        System.out.println("Instance Created!");
    };

    

    public static EagerSingletonDBConnection getInstance(){
        return INSTANCE;
    }

   

}