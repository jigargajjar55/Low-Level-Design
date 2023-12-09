package SingletonDesignPattern.LazySingleton.LazyInitializationDoubleLocking;

public class LazyInitializationDBConnection {

    private LazyInitializationDBConnection(){
        System.out.println("Instance is Created!");
    };

    private static volatile LazyInitializationDBConnection INSTANCE;

    public static LazyInitializationDBConnection getInstance(){

        if(INSTANCE == null){
            synchronized(LazyInitializationDBConnection.class){
                if(INSTANCE == null){
                    INSTANCE = new LazyInitializationDBConnection();
                }
            }
        }

        return INSTANCE;
    }
    
}
