package bt_TH.singleton.A4;

public class User {
    String name;
    private boolean hasVoted = false;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void  vote(Candidate c){
        if (!hasVoted) {
            Election.getInstance().vote(c,name);
            hasVoted = true;
        }
    }
}
