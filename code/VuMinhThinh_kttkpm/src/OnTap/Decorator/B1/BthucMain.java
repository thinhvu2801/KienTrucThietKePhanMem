package OnTap.Decorator.B1;

public class BthucMain {
    public static void main(String[] args) {
        BieuThuc bt1 = new BthucSimple(10);
        bt1 = new Cong(bt1, 10);
        System.out.println(bt1.bieuThuc());
        System.out.println("BT1: " + bt1.giaTri());
        bt1 = new Cong(bt1, 10);
        System.out.println(bt1.bieuThuc());
        System.out.println("BT2: " + bt1.giaTri());
    }
}
