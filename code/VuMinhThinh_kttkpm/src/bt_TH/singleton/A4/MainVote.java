package bt_TH.singleton.A4;

public class MainVote {
    public static void main(String[] args) {

        User Vungu= new User("Vu");
        Vungu.vote(Candidate.BIDEN);
        Vungu.vote(Candidate.BIDEN);Vungu.vote(Candidate.BIDEN);Vungu.vote(Candidate.BIDEN);Vungu.vote(Candidate.BIDEN);
        Election.getInstance().print();
    }
}
