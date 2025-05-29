package Lesson12;

public class PersonalNotification implements NotificationPlatform {
    @Override
    public void send(String message) {
        System.out.println("Sending to a Personal Recipient: " + message);
    }
}