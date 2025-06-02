package Lesson23;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        User alice = new User("Alice");
        User bob = new User("Bob");

        chatRoom.registerUser(alice);
        chatRoom.registerUser(bob);

        alice.sendMessage("Hello everyone!");
        bob.sendMessage("Hello Alice!");
    }
}