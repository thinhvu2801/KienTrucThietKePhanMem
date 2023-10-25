package behavioral.template_method.entityDB.CD2;

public class SinhVien {
    //maSV, tenSV, ngaySinh, queQuan.
    int maSV;
    String tenSV, ngaySinh, queQuan;

    public SinhVien(int maSV, String tenSV, String ngaySinh, String queQuan) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "Mã SV: " +maSV+"\nTên SV: "+tenSV+"\nNgày Sinh: " +ngaySinh+"\nQuê quán: "+queQuan+"\n";
    }
}
