package OnGiuaKi.De2;

public class Profile {
    private String name;
    private String phoneNumber;
    private String department;
    private String email;

    public Profile(String name, String phoneNumber, String department, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Department: " + department);
        System.out.println("Email: " + email);
        System.out.println("------------------------");
    }
}
