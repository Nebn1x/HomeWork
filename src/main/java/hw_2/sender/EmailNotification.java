package hw_2.sender;

public class EmailNotification implements NotificationSender {

    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}