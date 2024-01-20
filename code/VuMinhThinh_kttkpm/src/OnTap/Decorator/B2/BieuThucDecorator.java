package OnTap.Decorator.B2;

public class BieuThucDecorator extends BieuThuc {
    BieuThuc bieuThuc;

    public BieuThucDecorator(BieuThuc bieuThuc) {
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
