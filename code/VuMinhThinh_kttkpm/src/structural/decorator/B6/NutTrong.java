package structural.decorator.B6;

public class NutTrong implements Nut {
    Nut trai, phai;

    @Override
    public void add(Nut n) {
        if (trai == null) {
            trai = n;
        } else if (phai == null) {
            phai = n;
        }
    }

    @Override
    public void remove(Nut n) {
        if (trai == n) {
            trai = null;
        } else if (phai == n) {
            phai = null;
        }
    }

    @Override
    public void duyetCay() {
        System.out.println("Nut Trong");
        System.out.println("Ben trai:");
        if (trai != null) {
            trai.duyetCay();
        }
        System.out.println("Ben phai:");
        if (phai != null) {
            phai.duyetCay();
        }
    }
}
