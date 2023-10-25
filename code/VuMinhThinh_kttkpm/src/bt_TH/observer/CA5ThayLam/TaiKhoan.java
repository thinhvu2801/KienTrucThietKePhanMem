package bt_TH.observer.CA5ThayLam;

import java.net.SocketTimeoutException;

public class TaiKhoan implements ATM.I_RutTienATM {
    ATM atm;

    public TaiKhoan(ATM atm, String name, int soDu) {
        this.atm = atm;
        this.name = name;
        this.soDu = soDu;
    }

    String name;
    int soDu;

    public void duaTheVaoATM() {
        atm.attach(this);
    }

    public void rutTheKhoiATM() {
        atm.detach(this);
        System.out.println("Rut the "+name+" thanh cong!");
    }

    @Override
    public boolean kiemTraSoDu(int tienRut) {
        if (soDu-tienRut-50>=0)
            return true;
        return false;


    }

    @Override
    public void nhanThongBao(int tienRut, boolean thanhCong) {
        if (kiemTraSoDu(tienRut) == true) {
            System.out.println("Ten KH:" + name);
            System.out.println("Rut thanh cong " + tienRut);
            soDu = soDu - tienRut;
            System.out.println("So du con lai: " + soDu);
        }
        else System.out.println("Khong du tien trong the!");
    }
}
