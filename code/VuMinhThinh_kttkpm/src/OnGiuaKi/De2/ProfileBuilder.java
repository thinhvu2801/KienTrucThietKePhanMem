package OnGiuaKi.De2;

public class ProfileBuilder {
    private String name;
    private String phoneNumber;
    private String department;
    private String email;

    public ProfileBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ProfileBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public ProfileBuilder setDepartment(String department) {
        this.department = department;
        return this;
    }

    public ProfileBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public Profile build() {
        return new Profile(name, phoneNumber, department, email);
    }
}
