package bt_TH.observer.CA5;

public class MainATM {

    public static void main(String[] args) {

        ATM atm = new ATM();

        TaiKhoan taiKhoan = new TaiKhoan(100);

        atm.setTaiKhoan(taiKhoan);

        int soTienRut = 50;

        if (atm.kiemTraTienRut(soTienRut)) {
            atm.rutTien(soTienRut);
            atm.rutTien(soTienRut);
            atm.rutTien(soTienRut);
        } else {
            System.out.println("Số dư không đủ để rút " + soTienRut + " VND");
        }
    }
}