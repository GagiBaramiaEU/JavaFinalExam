package Davaleba4;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ReminderApp {
    public static void main(String[] args) {
        List<Reminder> reminders = new ArrayList<>();
        reminders.add(new Reminder("Take a break!", LocalTime.now().plusSeconds(10).withNano(0)));
        reminders.add(new Reminder("Meeting at 3 PM", LocalTime.now().plusSeconds(20).withNano(0)));
        reminders.add(new Reminder("Check emails", LocalTime.now().plusSeconds(30).withNano(0)));

        Thread t1 = new ReminderThread(reminders);
        Thread t2 = new ReminderThread(reminders);
        Thread t3 = new ReminderThread(reminders);

        t1.start();
        t2.start();
        t3.start();
    }
}
