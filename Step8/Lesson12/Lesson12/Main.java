//ブリッジパターン(Bridge pattern)を使って通知システムを設計
package Lesson12;

public class Main {
    public static void main(String[] args) {
        // メール通知で個人向け
        Notification emailToPersonal = new EmailNotification(new PersonalNotification());
        emailToPersonal.notify("Hello, John!");

        // SMS通知でグループ向け
        Notification smsToGroup = new SMSNotification(new GroupNotification());
        smsToGroup.notify("Meeting at 3 PM.");
    }
}