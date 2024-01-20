package OnTap.Decorator.B1;

public class BthucDecor extends BieuThuc {
    BieuThuc bieuThuc;

    public BthucDecor(BieuThuc bieuThuc) {
        this.bieuThuc = bieuThuc;
    }

    @Override
    public float giaTri() {
        return 0;
    }

    @Override
    public String bieuThuc() {
        return bieuThuc.bieuThuc();
    }
}
