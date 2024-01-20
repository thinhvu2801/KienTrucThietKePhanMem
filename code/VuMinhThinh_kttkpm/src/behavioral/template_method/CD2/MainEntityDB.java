package behavioral.template_method.CD2;

public class MainEntityDB {
    public static void main(String[] args) {
        Entity63<SinhVien> qlsv = new SinhVienDB();
        qlsv.add(new SinhVien(1,"VMT","28-01-2003","Nha Trang"));
        qlsv.add(new SinhVien(2,"ADS","28-11-2003","Nha Trang"));
        qlsv.add(new SinhVien(3,"ĐSX","28-12-2003","Nha Trang"));
        qlsv.add(new SinhVien(4,"GĐS","28-08-2003","Nha Trang"));
        qlsv.update(new SinhVien(3, "ĐSX", "28-12-2003", "Ha Noi"));
        qlsv.printInfo();

    }
}
