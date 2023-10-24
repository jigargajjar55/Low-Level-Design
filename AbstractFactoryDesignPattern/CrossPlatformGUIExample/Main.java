package AbstractFactoryDesignPattern.CrossPlatformGUIExample;



public class Main {
    public static void main(String[] args){

        //String systemOS = System.getProperty("os.name");

        String systemOS = "MAC OS";

        Application application = new Application(systemOS);

        application.paint();
       

        


    }
    
}
