package Davaleba4;

import java.time.LocalTime;
import java.util.List;

class ReminderThread extends Thread {
    private final List<Reminder> reminders;
    private static final Object lock = new Object();

    public ReminderThread(List<Reminder> reminders) {
        this.reminders = reminders;
    }

    @Override
    public void run() {
        int printCount = 5;
        while (printCount > 0) {
            LocalTime now = LocalTime.now().withNano(0);
            synchronized (lock) {
                for (Reminder reminder : reminders) {
                    if (reminder.getTime().equals(now)) {
                        System.out.println(Thread.currentThread().getName() + " - Reminder: " + reminder.getMessage());
                    }
                }
            }
            printCount--;
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}