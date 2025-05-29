package Lesson12;

public class GroupNotification implements NotificationPlatform {
    @Override
    public void send(String message) {
        System.out.println("Sending to a Group: " + message);
    }
}