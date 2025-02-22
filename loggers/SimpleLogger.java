package loggers;

import java.time.LocalDateTime;

public class SimpleLogger implements Logger {
    @Override
    public void log(String msg) {
        String currentTime = LocalDateTime.now().toString();
        System.out.println("[" + currentTime + "] " + msg);
    }
}
