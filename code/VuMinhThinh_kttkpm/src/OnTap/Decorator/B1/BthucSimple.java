package OnTap.Decorator.B1;

public class BthucSimple extends BieuThuc{
    float toanHang;

    public BthucSimple(float toanHang) {
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return toanHang;
    }

    @Override
    public String bieuThuc() {
        return String.valueOf(toanHang);
    }
}
