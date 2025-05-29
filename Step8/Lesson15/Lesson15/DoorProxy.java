package Lesson15;

public class DoorProxy implements Door {
    private RealDoor realDoor;
    private String correctPassword;

    public DoorProxy(String correctPassword) {
        this.realDoor = new RealDoor();
        this.correctPassword = correctPassword;
    }

    @Override
    public void open(String inputPassword) {
        if (inputPassword.equals(correctPassword)) {
            realDoor.open(inputPassword);
        } else {
            System.out.println("Access Denied! Incorrect password.");
        }
    }
}