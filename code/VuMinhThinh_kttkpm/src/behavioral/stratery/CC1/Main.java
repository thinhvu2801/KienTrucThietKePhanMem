package behavioral.stratery.CC1;

public class Main {
    public static void main(String[] args) {
        ITinh cong = new Cong();
        ITinh tru = new Tru();
        ITinh nhan = new Nhan();
        ITinh chia = new Chia();

        float a = 75;
        float b = 12;
        float c = 54;
        float d = 78;

        float ketQuaCong = cong.tinh(a, b);
        float ketQuaTru = tru.tinh(c, d);

        System.out.println("Kết quả cộng: " + ketQuaCong);
        System.out.println("Kết quả trừ: " + ketQuaTru);
    }
}
