package bt_TH.singleton.A4;

class User {
    String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void  vote(Candidate c){
        Election.getInstance().vote(c,name);
    }
}
