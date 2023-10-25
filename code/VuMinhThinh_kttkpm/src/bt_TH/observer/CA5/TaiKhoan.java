package bt_TH.observer.CA5;

public class TaiKhoan implements ITaiKhoan{
    private int soDu;

    public TaiKhoan(int soDu) {
        this.soDu = soDu;
    }

    @Override
    public boolean kiemTraSoDu(int soTienRut) {
        if(soDu >= soTienRut) {
            return true;
        }
        return false;
    }

    @Override
    public void nhanThongBao(int soTienRut) {
        soDu -= soTienRut;
        System.out.println("Số dư còn lại: " + soDu);
    }

}

interface ITaiKhoan {
    boolean kiemTraSoDu(int soTienRut);
    void nhanThongBao(int soTienRut);

}