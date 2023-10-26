package OnGiuaKi.De2;

public class Main {
    public static void main(String[] args) {
        ProfileBuilder builder = new ProfileBuilder();

        Profile member1 = builder.setName("Vu Ngu")
                .setPhoneNumber("11221446")
                .setDepartment("HR")
                .setEmail("aaaaa@gmail.com")
                .build();
        Profile member2 = builder.setName("Vu Ngu")
                .setPhoneNumber("11221446")
                .setDepartment("Marketing")
                .setEmail("aaaaa@gmail.com")
                .build();
        Profile member3 = builder.setName("Vu Ngu")
                .setPhoneNumber("11221446")
                .setDepartment("HR")
                .setEmail("aaaaa@gmail.com")
                .build();


        Group group1 = new Group("HR Team");
        group1.addMember(member1);

        Group group2 = new Group("Marketing Team");
        group2.addMember(member2);

        group1.display();
        group2.display();
    }
}
