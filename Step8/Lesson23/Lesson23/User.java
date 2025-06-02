package Lesson23;

public class User extends Participant {
    public User(String name) {
        super(name);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("[" + name + "] received message: \"" + message + "\"");
    }
}