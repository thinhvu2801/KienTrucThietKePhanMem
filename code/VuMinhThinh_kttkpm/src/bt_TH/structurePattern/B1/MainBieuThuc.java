package bt_TH.structurePattern.B1;

public class MainBieuThuc {
    public static void main(String[] args) {
        BieuThuc bieuthuc1 = new BieuThucDonGian(20);
        bieuthuc1 = new Cong(bieuthuc1, 20);
        System.out.println(bieuthuc1.bieuThuc());
        System.out.println(bieuthuc1.giaTri());
    }
}