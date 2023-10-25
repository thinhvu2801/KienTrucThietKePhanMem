package bt_TH.bt4;

class XeNoiThanh extends ChuyenXe {
    private int soTuyen;
    private double soKmDiDuoc;

    public XeNoiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu, int soTuyen, double soKmDiDuoc) {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen = soTuyen;
        this.soKmDiDuoc = soKmDiDuoc;
    }

    public void inThongTin() {
        super.inThongTin();
        System.out.println("Số tuyến: " + soTuyen);
        System.out.println("Số km đi được: " + soKmDiDuoc);
    }
}
