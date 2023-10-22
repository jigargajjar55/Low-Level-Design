package ChainOfResponsibilityDesignPattern.LoggerDesign;

public abstract class LogProcessor {

    public static int INFO = 0;
    public static int ERROR = 1;
    public static int DEBUG = 2;

    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor){
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(int logLevel, String message){

        if(this.nextLogProcessor != null){
            this.nextLogProcessor.log(logLevel, message);
        }else{
            System.out.println("Invalid Logs, Please add valid Log code!");
        }
    }
    
}
