package Lesson15;

public class RealDoor implements Door {
    @Override
    public void open(String password) {
        System.out.println("Opening the secret door...");
    }
}