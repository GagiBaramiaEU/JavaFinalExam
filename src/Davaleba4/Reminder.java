package Davaleba4;

import java.time.LocalTime;

class Reminder {
    private final String message;
    private final LocalTime time;

    public Reminder(String message, LocalTime time) {
        this.message = message;
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public LocalTime getTime() {
        return time;
    }
}