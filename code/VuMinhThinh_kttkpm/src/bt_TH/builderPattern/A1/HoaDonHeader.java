package bt_TH.builderPattern.A1;

public class HoaDonHeader {

    String MaHD, NgayBan, TenKH;
    public HoaDonHeader(){
        MaHD = "";
        NgayBan = "";
        TenKH = "";
    }
    public HoaDonHeader(String maHD, String ngayBan, String tenKH){
        this.MaHD = maHD;
        this.TenKH = tenKH;
        this.NgayBan = ngayBan;
    }

    @Override
    public String toString() {
        return "Ma hoa don:" + MaHD + " Ngay ban: " + NgayBan + " Ten KH: " + TenKH;
    }
}


