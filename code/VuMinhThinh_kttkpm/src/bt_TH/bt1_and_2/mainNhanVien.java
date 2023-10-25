package bt_TH.bt1_and_2;

public class mainNhanVien {

    public static void main(String[] args) {

        NhanVien nv1 = new NhanVien("Vu Minh Thinh", 20, "Nha Trang", 100, 90);
//        System.out.println(nv1.getThongTin());

        NhanVien nv2 = new NhanVien("Vu Minh Thinh", 20, "Nha Trang", 100, 150);
//        System.out.println(nv2.getThongTin());

        NhanVien nv3 = new NhanVien("Vu Minh Thinh", 20, "Nha Trang", 100, 250);
//        System.out.println(nv3.getThongTin());

        NhanVien nv4 = new NhanVien("Vu Minh Thinh", 20, "Nha Trang", 100, 250);
//        System.out.println(nv4.getThongTin());

        NhanVien nv5 = new NhanVien("Vu Minh Thinh", 20, "Nha Trang", 100, 250);
//        System.out.println(nv5.getThongTin());

        QuanLyNhanVien ql = new QuanLyNhanVien();

        ql.them(nv1);
        ql.them(nv2);
        ql.them(nv3);
        ql.them(nv4);
        ql.them(nv5);

        ql.inDS();


    }
}