package loggers;

public class Main {
    public static void main(String[] args) {
        Logger simpleLogger = new SimpleLogger();
        Logger smartLogger = new SmartLogger();

        simpleLogger.log("Инф. от simple log");

        smartLogger.log("info log message");
        smartLogger.log("error log message");
        smartLogger.log("log message");
        smartLogger.log("ErRor message");
    }
}
