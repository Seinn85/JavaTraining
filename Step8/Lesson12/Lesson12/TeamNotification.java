package Lesson12;

public class TeamNotification implements NotificationPlatform {
    @Override
    public void send(String message) {
        System.out.println("Sending to a Team: " + message);
    }
}