package Lesson23;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatRoomMediator {
    private List<Participant> participants = new ArrayList<>();

    @Override
    public void registerUser(Participant user) {
        participants.add(user);
        user.setMediator(this);
        System.out.println("[ChatRoom] User " + user.getName() + " joined the room.");
    }

    @Override
    public void sendMessage(String message, Participant sender) {
        System.out.println("[ChatRoom] Broadcasting " + sender.getName() + "'s message to other users...");
        for (Participant p : participants) {
            if (p != sender) {
                p.receiveMessage(message);
            }
        }
    }
}