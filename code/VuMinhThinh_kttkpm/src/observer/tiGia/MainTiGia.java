package observer.tiGia;

public class MainTiGia {
    public static void main(String[] args) {
        TiGia tiGia = new TiGia();
        NhaDauTuA nhaDauTuA = new NhaDauTuA(tiGia);
        NhaDauTuB nhaDauTuB = new NhaDauTuB(tiGia);
        tiGia.notifyTiGia((float) 2.0);

        System.out.println("Lần 1: ");
        tiGia.notifyTiGia((float) 2.0);
        nhaDauTuA.huyDangKi();
        System.out.println("Lần 2: ");
        tiGia.notifyTiGia((float) 20.0);
        nhaDauTuB.huyDangKi();
    }
}
