package behavioral.stratery.CC2;

public class SoSanhTheoDiem implements ISoSanh<SinhVien> {
    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        return Float.compare(o1.getDiem(), o2.getDiem());
    }
}
