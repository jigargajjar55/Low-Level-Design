package ChainOfResponsibilityDesignPattern.LoggerDesign;

public abstract class LogProcessor {

   
    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor){
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(LogType logtype, String message){

        if(this.nextLogProcessor != null){
            this.nextLogProcessor.log(logtype, message);
        }else{
            System.out.println("Invalid Logs, Please add valid Log code!");
        }
    }
    
}
