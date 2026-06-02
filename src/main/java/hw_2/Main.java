package hw_2;

import hw_2.sender.EmailNotification;
import hw_2.sender.PushNotification;
import hw_2.sender.SmsNotification;
import hw_2.service.NotificationService;

public class Main {
    public static void main(String[] args) {
        NotificationService emailService = new NotificationService(new EmailNotification());
        NotificationService smsService = new NotificationService(new SmsNotification());
        NotificationService pushService = new NotificationService(new PushNotification());

        emailService.notifyUser("Hello Email");

        smsService.notifyUser("Hello SMS");

        pushService.notifyUser("Hello PUSH");
    }
}