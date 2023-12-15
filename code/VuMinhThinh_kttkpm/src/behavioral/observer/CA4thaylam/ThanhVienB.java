package behavioral.observer.CA4thaylam;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements Topic.Topic_Observer {
    List<Tin> list = new ArrayList<>();
    Topic t;

    public ThanhVienB(Topic t) {
        this.t = t;
        t.dangKiObserver(this);
    }

    @Override
    public void taoMoi(Tin t) {
        System.out.println("TVB Tin moi: ");
        list.add(0, t);
        for (Tin tin : list) {
            System.out.println("TVB id: " + tin.id);
            System.out.println("TVB Noi dung: " + tin.noiDung);
        }

    }

    @Override
    public void capNhatT(Tin t) {
        for (Tin tin : list) {
            if (t.id == tin.id) {
                tin.noiDung = t.noiDung;
                System.out.println("TVB Tin cap nhat: ");
                System.out.println("TVB id: " + tin.id);
                System.out.println("TVB Noi dung: " + tin.noiDung);
                break;
            }
        }
    }
}