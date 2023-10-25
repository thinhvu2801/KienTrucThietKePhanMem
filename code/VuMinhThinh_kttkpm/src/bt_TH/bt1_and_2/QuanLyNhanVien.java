package bt_TH.bt1_and_2;
import java.util.ArrayList;

public class QuanLyNhanVien implements IQuanLy {

    private final ArrayList<NhanVien> dsNhanVien;

    public QuanLyNhanVien() {
        dsNhanVien = new ArrayList<>();
    }

    @Override
    public void them(NhanVien nv) {
        dsNhanVien.add(nv);
    }

    @Override
    public void inDS() {
        for (NhanVien nv : dsNhanVien) {
            System.out.println(nv.getThongTin());
        }
    }

}

