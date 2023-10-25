package bt_TH.bt4;

public class MainChuyenXe {
    public static void main(String[] args) {
        QuanLyChuyenXe ql = new QuanLyChuyenXe();

        XeNgoaiThanh xeNgoaiThanh1 = new XeNgoaiThanh("NT001", "Tài Xế A", "Xe 001", 2000.0, "Nơi A", 3);
        XeNgoaiThanh xeNgoaiThanh2 = new XeNgoaiThanh("NT002", "Tài Xế B", "Xe 002", 1800.0, "Nơi B", 2);
        XeNgoaiThanh xeNgoaiThanh3 = new XeNgoaiThanh("NT003", "Tài Xế C", "Xe 003", 2200.0, "Nơi C", 4);

        XeNoiThanh xeNoiThanh1 = new XeNoiThanh("NTT001", "Tài Xế D", "Xe 101", 500.0, 10, 100.0);
        XeNoiThanh xeNoiThanh2 = new XeNoiThanh("NTT002", "Tài Xế E", "Xe 102", 600.0, 20, 150.0);
        XeNoiThanh xeNoiThanh3 = new XeNoiThanh("NTT003", "Tài Xế F", "Xe 103", 700.0, 30, 200.0);

        ql.themChuyenXe(xeNgoaiThanh1);
        ql.themChuyenXe(xeNgoaiThanh2);
        ql.themChuyenXe(xeNgoaiThanh3);

        ql.themChuyenXe(xeNoiThanh1);
        ql.themChuyenXe(xeNoiThanh2);
        ql.themChuyenXe(xeNoiThanh3);

        ql.xuatDanhSachChuyenXe();

        System.out.println("Tổng doanh thu xe nội thành: " + ql.tinhTongDoanhThuNoiThanh());
        System.out.println("Tổng doanh thu xe ngoại thành: " + ql.tinhTongDoanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu cả hai loại xe: " + ql.tinhTongDoanhThuTatCa());
    }
}