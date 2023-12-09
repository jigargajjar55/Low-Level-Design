package ChainOfResponsibilityDesignPattern.LoggerDesign;

public class InfoLogProcessor extends LogProcessor{
    

    public InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(LogType logtype, String message){

        if(logtype == LogType.INFO){
            System.out.println(message);
        }else{

            super.log(logtype, message);
        }
    }
    
}
