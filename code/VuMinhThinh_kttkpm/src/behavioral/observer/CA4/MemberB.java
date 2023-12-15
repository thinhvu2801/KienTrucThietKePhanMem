package behavioral.observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class MemberB {
    private String name;
    private List<String> receivedMessages;

    public MemberB(String name) {
        this.name = name;
        this.receivedMessages = new ArrayList<>();
    }

    public void update(List<String> messages) {
        receivedMessages = new ArrayList<>(messages);
        displayMessages();
    }

    private void displayMessages() {
        System.out.println(name + " received messages:");
        for (int i = 0; i < receivedMessages.size(); i++) {
            System.out.println("Message " + (i + 1) + ": " + receivedMessages.get(i));
        }
    }
}
