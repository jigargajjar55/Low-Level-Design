package ChainOfResponsibilityDesignPattern.LoggerDesign;

public class ErrorLogProcessor extends LogProcessor {


    public ErrorLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(LogType logtype, String message){

        if(logtype == LogType.ERROR){
            System.out.println(message);
        }else{

            super.log(logtype, message);
        }
    }
    
}
