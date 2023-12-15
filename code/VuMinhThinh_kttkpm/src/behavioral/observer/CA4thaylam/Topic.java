package behavioral.observer.CA4thaylam;

import java.util.ArrayList;
import java.util.List;

//subject
public class Topic {
    List<Topic_Observer> observers = new ArrayList<>();
    List<Tin> list = new ArrayList<>();

    public void dangKiObserver(Topic_Observer t) {
        observers.add(t);
    }

    public void huyDangKiObserver(Topic_Observer t) {
        observers.remove(t);
    }

    public void taoTinMoi(Tin t) {
        list.add(t);
        for (Topic_Observer o : observers) {
            o.taoMoi(t); // Fix the recursive call
        }
    }

    public void capNhatTin(Tin t) {
        for (Tin tin : list) {
            if (t.id == tin.id) {
                tin.noiDung = t.noiDung;
                for (Topic_Observer o : observers)
                    o.capNhatT(t);
                break;
            }
        }
    }

    public static interface Topic_Observer {
        void taoMoi(Tin t);

        void capNhatT(Tin t);
    }
}



