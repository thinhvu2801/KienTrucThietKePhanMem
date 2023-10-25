package bt_TH.structurePattern.B1;

public class BieuThucDecorator extends BieuThuc {
    BieuThuc bieuThuc;
    @Override
    public float giaTri(){
        return 0;
    }
    public BieuThucDecorator(BieuThuc bieuThuc){
        this.bieuThuc = bieuThuc;
    }

    @Override
    public String bieuThuc() {
        return bieuThuc.bieuThuc();
    }
}
