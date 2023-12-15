package structural.decorator.B6;

public class MainBinaryTree {
    public static void main(String[] args) {
        Nut la1 = new NutLa("La 1");
        Nut la2 = new NutLa("La 2");

        Nut trong1 = new NutTrong();
        trong1.add(la1);
        trong1.add(la2);

        Nut la3 = new NutLa("La 3");
        Nut la4 = new NutLa("La 4");

        Nut trong2 = new NutTrong();
        trong2.add(la3);
        trong2.add(la4);

        Nut goc = new NutTrong();
        goc.add(trong1);
        goc.add(trong2);

        goc.duyetCay();
    }
}
