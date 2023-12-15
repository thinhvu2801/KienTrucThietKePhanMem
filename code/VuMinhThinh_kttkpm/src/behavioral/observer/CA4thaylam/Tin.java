package behavioral.observer.CA4thaylam;

public class Tin {
    String noiDung;
    int id;

    public Tin(int id, String noiDung) {
        this.id = id;
        this.noiDung = noiDung;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getnoiDung() {
        return noiDung;
    }

    public void setnoiDung(String noiDung) {
        this.noiDung = noiDung;
    }
}
