package loggers;

import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    private int logCount = 0;

    @Override
    public void log(String msg) {
        logCount++;

        String currentTime = LocalDateTime.now().toString();

        String logLevel = msg.toLowerCase().contains("error") ? "ERROR" : "INFO";

        System.out.println(logLevel + "#" + logCount + " [" + currentTime + "] " + msg);
    }
}
