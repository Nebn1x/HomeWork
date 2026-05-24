package hw_2.sender;

public class PushNotification implements NotificationSender {

    @Override
    public void send(String message) {
        System.out.println("Sending PUSH: " + message);
    }
}