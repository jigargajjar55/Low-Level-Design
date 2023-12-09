package SingletonDesignPattern.LazySingleton.LazyInitialization;

public class LazyInitializationDBConnection {

    private static LazyInitializationDBConnection INSTANCE;

    private LazyInitializationDBConnection(){}

    //Expensive method :- As there will be 1000s of requests
    synchronized public static LazyInitializationDBConnection getInstance(){
        if(INSTANCE == null){
            INSTANCE = new LazyInitializationDBConnection();
        }
        return INSTANCE;
    }
    
}
