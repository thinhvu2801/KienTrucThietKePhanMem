package behavioral.observer.CA4;

import java.util.List;

public class MemberA {
    private String name;

    public MemberA(String name) {
        this.name = name;
    }

    public void update(List<String> messages) {
        String latestMessage = messages.get(messages.size() - 1);
        System.out.println(name + " received new message: " + latestMessage);
    }
}
