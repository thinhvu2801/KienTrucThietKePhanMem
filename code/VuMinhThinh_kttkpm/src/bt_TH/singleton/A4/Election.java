package bt_TH.singleton.A4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Election {
    int trump;
    int biden;
    private static Election election;

    private List<String> votedUsers = new ArrayList<>();
    private Map<String, Boolean> votedUsersMap = new HashMap<>();

    private Election() {}

    public static Election getInstance(){
        if (election==null)
            election = new Election();
        return election;
    }

    public void vote(Candidate c , String name){
        votedUsers.add(name);
        votedUsersMap.put(name, true);

        if (c==Candidate.TRUMP)
            trump++;
        if(c==Candidate.BIDEN)
            biden++;
    }

    public void print(){
        System.out.printf("BIDEN: " + biden +"\nTRUMP: "+ trump);
    }
}
