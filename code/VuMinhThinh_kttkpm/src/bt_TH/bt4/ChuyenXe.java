package bt_TH.bt4;

class ChuyenXe {
    private String maSoChuyen;
    private String hoTenTaiXe;
    private String soXe;
    private double doanhThu;

    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.doanhThu = doanhThu;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void inThongTin() {
        System.out.println("Mã số chuyến: " + maSoChuyen);
        System.out.println("Họ tên tài xế: " + hoTenTaiXe);
        System.out.println("Số xe: " + soXe);
        System.out.println("Doanh thu: " + doanhThu);
    }
}