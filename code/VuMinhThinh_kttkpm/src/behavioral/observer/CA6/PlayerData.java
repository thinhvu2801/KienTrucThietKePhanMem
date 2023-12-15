package behavioral.observer.CA6;

import java.util.ArrayList;
import java.util.List;

public class PlayerData {
    private int thoiGian;
    private int countdown;
    private int grade;

    private List<DashBoard> dashboards = new ArrayList<>();

    public void addObserver(DashBoard dashboard) {
        dashboards.add(dashboard);
    }

    public void removeObserver(DashBoard dashboard) {
        dashboards.remove(dashboard);
    }

    public void notifyObservers() {
        for (DashBoard dashboard : dashboards) {
            dashboard.update(thoiGian, countdown, grade);
        }
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
        notifyObservers();
    }

    public void setCountdown(int countdown) {
        this.countdown = countdown;
        notifyObservers();
    }

    public void setGrade(int grade) {
        this.grade = grade;
        notifyObservers();
    }
}
