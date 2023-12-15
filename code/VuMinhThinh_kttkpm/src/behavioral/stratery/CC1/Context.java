package behavioral.stratery.CC1;

public class Context {
    private ITinh tinh;

    public Context(ITinh tinh) {
        this.tinh = tinh;
    }

    public float tinh(float a, float b) {
        return tinh.tinh(a, b);
    }
}