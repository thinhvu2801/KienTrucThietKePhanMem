package bt_TH.observer.CA5ThayLam;

//subject
public class ATM {
    //observer đã đăng kí với subject
    I_RutTienATM taiKhoan;
    public  void attach(I_RutTienATM taiKhoan){
        this.taiKhoan=taiKhoan;
    }
    public void detach(I_RutTienATM taiKhoan){
        if(this.taiKhoan==taiKhoan)
            taiKhoan=null;
        }
    private boolean kiemTraTienRut(int soTien){
        if ((taiKhoan.kiemTraSoDu(soTien)==true))
            return true;
         return false;
    }
    public void rutTien(int soTien){
        if(taiKhoan!=null){
            if(kiemTraTienRut(soTien)==true)
                taiKhoan.nhanThongBao(soTien,true);
            else taiKhoan.nhanThongBao(soTien,false);
        }
        else
            System.out.println("Khong co the trong may");
    }

    public static interface I_RutTienATM{
        boolean kiemTraSoDu(int tienRut);
        void nhanThongBao(int tienRut, boolean thanhCong);

    }
}
