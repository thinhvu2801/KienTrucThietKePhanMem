package behavioral.observer.CA4;

public class MainApp {
    public static void main(String[] args) {
        Topic topic = new Topic();

        MemberA memberA = new MemberA("Member A");
        MemberB memberB = new MemberB("Member B");

        topic.addMemberA(memberA);
        topic.addMemberB(memberB);

        topic.createNewMessage("Hello, this is the first message.");

        topic.createNewMessage("New message for all members.");

        topic.updateMessage(0, "Updated message for Member A.");

        topic.createNewMessage("Another new message for all members.");
    }
}
