package Lesson12;

public class EmailNotification extends Notification {
    public EmailNotification(NotificationPlatform platform) {
        super(platform);
    }

    @Override
    public void notify(String message) {
        System.out.print("Sending Email ");
        platform.send(message);
    }
}