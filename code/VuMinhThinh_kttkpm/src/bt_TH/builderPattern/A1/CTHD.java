package bt_TH.builderPattern.A1;

public class CTHD {
    String SanPham;
    int Soluong, DonGia;
    double ChieuKhau;
    public CTHD(){
        SanPham = "";
        Soluong = 0;
        DonGia = 0;
        ChieuKhau = 1.0;
    }
    public CTHD(String sanPham, int soluong, int donGia, double chieuKhau){
        this.SanPham = sanPham;
        this.Soluong = soluong;
        this.DonGia = donGia;
        this.ChieuKhau = chieuKhau;
    }

    @Override
    public String toString() {
        return "Ten: " + SanPham + " So Luong: " + Soluong + " Don gia: " + DonGia + " Chiet khau: " + ChieuKhau;
    }
}


