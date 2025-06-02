package Lesson23;

public abstract class Participant {
    protected ChatRoomMediator mediator;
    protected String name;

    public Participant(String name) {
        this.name = name;
    }

    public void setMediator(ChatRoomMediator mediator) {
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public abstract void receiveMessage(String message);
    
    public void sendMessage(String message) {
        System.out.println("[" + name + "] → ChatRoom: \"" + message + "\"");
        mediator.sendMessage(message, this);
    }
}