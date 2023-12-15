package behavioral.observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    private List<MemberA> memberAs = new ArrayList<>();
    private List<MemberB> memberBs = new ArrayList<>();
    private List<String> messages = new ArrayList<>();

    public void addMemberA(MemberA memberA) {
        memberAs.add(memberA);
    }

    public void removeMemberA(MemberA memberA) {
        memberAs.remove(memberA);
    }

    public void addMemberB(MemberB memberB) {
        memberBs.add(memberB);
    }

    public void removeMemberB(MemberB memberB) {
        memberBs.remove(memberB);
    }

    public void createNewMessage(String message) {
        messages.add(message);
        notifyMembers();
    }

    public void updateMessage(int index, String updatedMessage) {
        if (index >= 0 && index < messages.size()) {
            messages.set(index, updatedMessage);
            notifyMembers();
        }
    }

    private void notifyMembers() {
        for (MemberA memberA : memberAs) {
            memberA.update(messages);
        }
        for (MemberB memberB : memberBs) {
            memberB.update(messages);
        }
    }
}
