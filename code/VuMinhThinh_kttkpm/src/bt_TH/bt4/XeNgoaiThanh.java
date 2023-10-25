package bt_TH.bt4;

class XeNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgayDi;

    public XeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, String noiDen, int soNgayDi) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.noiDen = noiDen;
        this.soNgayDi = soNgayDi;
    }

    public void inThongTin() {
        super.inThongTin();
        System.out.println("Nơi đến: " + noiDen);
        System.out.println("Số ngày đi: " + soNgayDi);
    }
}