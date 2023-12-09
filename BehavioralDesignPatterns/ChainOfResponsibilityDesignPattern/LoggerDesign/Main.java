package ChainOfResponsibilityDesignPattern.LoggerDesign;

public class Main {

    public static void main(String[] args){

        LogProcessor logger = new ErrorLogProcessor(new InfoLogProcessor(new DebugLogProcessor(null)));

        logger.log(LogType.INFO, "This is Info Log.");
        logger.log(LogType.DEBUG, "This is Debug Log.");
        logger.log(LogType.ERROR, "This is Error Log.");

        logger.log(null, "This is Error Log.");



    }
    
}
