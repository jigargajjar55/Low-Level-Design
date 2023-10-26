package ChainOfResponsibilityDesignPattern.LoggerDesign;

public class Main {

    public static void main(String[] args){

        LogProcessor logger = new ErrorLogProcessor(new InfoLogProcessor(new DebugLogProcessor(null)));

        logger.log(LogProcessor.INFO, "This is Info Log.");
        logger.log(LogProcessor.DEBUG, "This is Debug Log.");
        logger.log(LogProcessor.ERROR, "This is Error Log.");

        logger.log(23, "This is Error Log.");



    }
    
}
