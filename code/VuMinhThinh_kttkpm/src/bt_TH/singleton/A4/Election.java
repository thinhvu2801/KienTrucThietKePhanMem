package bt_TH.singleton.A4;

import java.util.ArrayList;
import java.util.List;

public class Election {
    int trump;
    int biden;
    private static Election election;

    List<String> votedUsers = new ArrayList<>();

    public static Election getInstance(){
        if (election==null)
            election = new Election();
        return election;
    }
    public void vote(Candidate c , String name){
        for (int i=0;i<votedUsers.size();i++){
            if(votedUsers.equals(name))
                return;
        }
        votedUsers.add(name);
        if (c==Candidate.TRUMP)
            trump++;
        if(c==Candidate.BIDEN)
            biden++;
    }
    public void print(){
        System.out.printf("BIDEN: " + biden +"\nTRUMP: "+ trump);
    }
}
