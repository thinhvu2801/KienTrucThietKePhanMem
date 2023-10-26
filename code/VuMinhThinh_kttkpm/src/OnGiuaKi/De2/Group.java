package OnGiuaKi.De2;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String groupName;
    private List<Profile> members;

    public Group(String groupName) {
        this.groupName = groupName;
        this.members = new ArrayList<>();
    }

    public void addMember(Profile member) {
        members.add(member);
    }

    public void display() {
        System.out.println("Group Name: " + groupName);
        for (Profile member : members) {
            member.display();
        }
    }
}
