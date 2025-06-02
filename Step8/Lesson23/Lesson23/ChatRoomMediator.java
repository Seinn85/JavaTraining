package Lesson23;

public interface ChatRoomMediator {
    void registerUser(Participant user);
    void sendMessage(String message, Participant sender);
}