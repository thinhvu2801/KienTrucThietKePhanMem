package OnTap.Decorator.B1;

public class Cong extends BthucDecor{
    float toanHang;

    public Cong(BieuThuc bieuThuc, float toanHang) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri()+toanHang;
    }

    @Override
    public String bieuThuc() {
        return bieuThuc.giaTri()+"+"+toanHang;
    }
}
