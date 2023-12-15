package behavioral.stratery.CC2;

import java.util.ArrayList;
import java.util.List;

public class QLSV {
    ISoSanh<SinhVien> soSanh;
    List<SinhVien> dsSV = new ArrayList<>();

    public void inDS() {
        for (SinhVien sv : dsSV) {
            System.out.println("Tên: " + sv.getTen() + ", Điểm: " + sv.getDiem());
        }
    }

    public void sapXep(ISoSanh<SinhVien> s) {
        for (int i = 0; i < dsSV.size(); i++)
            for (int j = i + 1; j < dsSV.size() - 1; j++)
                if (s.soSanh(dsSV.get(i), dsSV.get(j)) > 0) {
                    SinhVien sv = dsSV.get(i);
                    dsSV.set(i, dsSV.get(j));
                    dsSV.set(j, sv);
                }
    }
}
