package behavioral.observer.CA4thaylam;

import java.awt.image.TileObserver;

public class ThanhVienA implements Topic.Topic_Observer{
    Topic t;

    public ThanhVienA(Topic t) {
        this.t = t;
        t.dangKiObserver(this);
    }

    @Override
    public void taoMoi(Tin t) {
        System.out.println("TVA Tin moi: ");
        inTin(t);
    }

    @Override
    public void capNhatT(Tin t) {
        System.out.println("TVA Cap nhat tin: ");
        inTin(t);

    }
    void inTin(Tin t){
        System.out.println("TVA id: "+ t.id );
        System.out.println("TVA Noi dung: "+ t.noiDung);
    }
}
