package bt_TH.observer.CA5;

public class ATM {
    private TaiKhoan taiKhoan;

    public void setTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public boolean kiemTraTienRut(int soTienRut) {
        return taiKhoan.kiemTraSoDu(soTienRut);
    }

    public void rutTien(int soTienRut) {
        if (kiemTraTienRut(soTienRut)) {
            System.out.println("Rút tiền thành công");
            taiKhoan.nhanThongBao(soTienRut);
        } else {
            System.out.println("Số dư không đủ để rút tiền");
        }
    }
}