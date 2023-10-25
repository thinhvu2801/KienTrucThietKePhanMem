package bt_TH.builderPattern.A1;

public class MainHoaDon {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon.Builder()
                .addHeader("Abc ", "12 ","abc ")
                .addCTHD("abc ", 2,  2,  2.0)
                .build();
        System.out.println(hoaDon.toString());
    }
}

