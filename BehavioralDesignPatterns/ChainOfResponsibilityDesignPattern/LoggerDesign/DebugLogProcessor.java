package ChainOfResponsibilityDesignPattern.LoggerDesign;

public class DebugLogProcessor extends LogProcessor {
    

    public DebugLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(LogType logtype,  String message){

        if(logtype == LogType.DEBUG){
            System.out.println(message);
        }else{

            super.log(logtype, message);
        }
    }
    
}
