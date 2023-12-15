package creational.factory.CB1Thaylam;

public class MainATM {
    public static void main(String[] args) {
        ATM_MenhGia m500 = new ATM_MenhGia(500);
        ATM_MenhGia m200 = new ATM_MenhGia(200);
        ATM_MenhGia m100 = new ATM_MenhGia(100);
        ATM_MenhGia m50 = new ATM_MenhGia(50);
        ATM_MenhGia m20 = new ATM_MenhGia(20);
        ATM_MenhGia m10 = new ATM_MenhGia(10);
        ATM_MenhGia m5 = new ATM_MenhGia(5);
        ATM_MenhGia m1 = new ATM_MenhGia(1);
        m500.thietLapMenhGiaKeTiep(m200)
                .thietLapMenhGiaKeTiep(m100)
                .thietLapMenhGiaKeTiep(m50)
                .thietLapMenhGiaKeTiep(m20)
                .thietLapMenhGiaKeTiep(m10)
                .thietLapMenhGiaKeTiep(m5)
                .thietLapMenhGiaKeTiep(m1);
        m500.rutTien(1_369);
        System.out.println("Lần 2: ");
        m10.rutTien(1_369);


        ATM_Factory atmFactory = new ATM_Factory();
        System.out.println("Lần 3: ");
        atmFactory.taoATM_TheoMenhGia(100).rutTien(1_369);
    }
}
