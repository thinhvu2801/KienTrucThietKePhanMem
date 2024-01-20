package behavioral.template_method.CD2;

public class SinhVienDB extends Entity63<SinhVien> {
    @Override
    protected int getKey(SinhVien sinhVien) {
        return sinhVien.maSV;
    }
}
