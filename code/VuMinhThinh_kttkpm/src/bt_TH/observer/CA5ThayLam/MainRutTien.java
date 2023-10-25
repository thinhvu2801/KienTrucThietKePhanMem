package bt_TH.observer.CA5ThayLam;

public class MainRutTien {
    public static void main(String[] args) {
        ATM atm=new ATM();
        TaiKhoan AA = new TaiKhoan(atm,"Thinh",100);
        TaiKhoan BB = new TaiKhoan(atm,"Tin",100);
        System.out.println("Giao dich lan 1: ");
        AA.duaTheVaoATM();
        AA.atm.rutTien(10);
        AA.rutTheKhoiATM();
        BB.duaTheVaoATM();
        BB.atm.rutTien(10);
        BB.rutTheKhoiATM();
        System.out.println("Giao dich lan 2: ");
        AA.duaTheVaoATM();
        AA.atm.rutTien(60);
        AA.rutTheKhoiATM();
        BB.duaTheVaoATM();
        BB.atm.rutTien(60);
        BB.rutTheKhoiATM();
    }
}
