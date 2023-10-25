package bt_TH.bt4;
import java.util.ArrayList;

class QuanLyChuyenXe {
    private ArrayList<ChuyenXe> danhSachChuyenXe = new ArrayList<>();

    public void themChuyenXe(ChuyenXe chuyenXe) {
        danhSachChuyenXe.add(chuyenXe);
    }

    public void xuatDanhSachChuyenXe() {
        for (ChuyenXe chuyenXe : danhSachChuyenXe) {
            chuyenXe.inThongTin();
            System.out.println();
        }
    }

    public double tinhTongDoanhThuNoiThanh() {
        double tongDoanhThu = 0;
        for (ChuyenXe chuyenXe : danhSachChuyenXe) {
            if (chuyenXe instanceof XeNoiThanh) {
                tongDoanhThu += chuyenXe.getDoanhThu();
            }
        }
        return tongDoanhThu;
    }

    public double tinhTongDoanhThuNgoaiThanh() {
        double tongDoanhThu = 0;
        for (ChuyenXe chuyenXe : danhSachChuyenXe) {
            if (chuyenXe instanceof XeNgoaiThanh) {
                tongDoanhThu += chuyenXe.getDoanhThu();
            }
        }
        return tongDoanhThu;
    }

    public double tinhTongDoanhThuTatCa() {
        double tongDoanhThu = 0;
        for (ChuyenXe chuyenXe : danhSachChuyenXe) {
            tongDoanhThu += chuyenXe.getDoanhThu();
        }
        return tongDoanhThu;
    }
}