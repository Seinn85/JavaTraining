package Lesson12;

public abstract class Notification {
    protected NotificationPlatform platform;

    public Notification(NotificationPlatform platform) {
        this.platform = platform;
    }

    public abstract void notify(String message);
}