package creational.factory.CB1Thaylam;

public class ATM_Factory {
    ATM_MenhGia m500 = new ATM_MenhGia(500);
    ATM_MenhGia m200 = new ATM_MenhGia(200);
    ATM_MenhGia m100 = new ATM_MenhGia(100);
    ATM_MenhGia m50 = new ATM_MenhGia(50);
    ATM_MenhGia m20 = new ATM_MenhGia(20);
    ATM_MenhGia m10 = new ATM_MenhGia(10);
    ATM_MenhGia m5 = new ATM_MenhGia(5);
    ATM_MenhGia m1 = new ATM_MenhGia(1);

    public ATM_Factory() {
        m500.thietLapMenhGiaKeTiep(m200)
                .thietLapMenhGiaKeTiep(m100)
                .thietLapMenhGiaKeTiep(m50)
                .thietLapMenhGiaKeTiep(m20)
                .thietLapMenhGiaKeTiep(m10)
                .thietLapMenhGiaKeTiep(m5)
                .thietLapMenhGiaKeTiep(m1);
    }
    public ATM_MenhGia taoATM_TheoMenhGia(int menhGia){
        switch (menhGia){
            case 500: return m500;
            case 200: return m200;
            case 100: return m100;
            case 50: return m50;
            default:return m500;
        }
    }
}
