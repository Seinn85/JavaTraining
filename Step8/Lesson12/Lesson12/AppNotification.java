package Lesson12;

public class AppNotification extends Notification {
    public AppNotification(NotificationPlatform platform) {
        super(platform);
    }

    @Override
    public void notify(String message) {
        System.out.print("Sending App ");
        platform.send(message);
    }
}