package Lesson12;

public class SMSNotification extends Notification {
    public SMSNotification(NotificationPlatform platform) {
        super(platform);
    }

    @Override
    public void notify(String message) {
        System.out.print("Sending SMS ");
        platform.send(message);
    }
}