package ChainOfResponsibilityDesignPattern.LoggerDesign;

public class InfoLogProcessor extends LogProcessor{
    

    public InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message){

        if(logLevel == INFO){
            System.out.println(message);
        }else{

            super.log(logLevel, message);
        }
    }
    
}
