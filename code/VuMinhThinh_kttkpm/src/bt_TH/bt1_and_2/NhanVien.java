package bt_TH.bt1_and_2;

public class NhanVien {
    String name;
    int age;
    String address;
    double salary;
    int timeWork;

    public NhanVien() {

    }
    public NhanVien(String name, int age, String address, double salary, int timeWork) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.timeWork = timeWork;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(int timeWork) {
        this.timeWork = timeWork;
    }
    public double tinhThuong() {
        if(timeWork < 100) {
            return 0;
        }
        if(timeWork < 200) {
            return salary * 0.1;
        }
        return salary * 0.2;

    }
    public String getThongTin() {
        return "Tên: " + name + ", Tuổi: " + age + ", Địa chỉ: " + address + ", Lương: " + salary + ", Tổng số giờ làm: " + timeWork + " Thưởng: "+ tinhThuong();
    }

}
