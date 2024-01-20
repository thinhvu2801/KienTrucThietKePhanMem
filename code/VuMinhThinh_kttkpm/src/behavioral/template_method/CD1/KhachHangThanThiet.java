package behavioral.template_method.CD1;

import java.util.List;

public class KhachHangThanThiet extends KhachHang {
    public KhachHangThanThiet(List<MatHang1> dsHangHoa) {
        super(dsHangHoa);
    }

    @Override
    public double tinhTien() {
        double tongTien = 0;
        for (MatHang1 matHang : dsHangHoa) {
            tongTien += matHang.thanhTien();
        }
        return tongTien;
    }

    @Override
    public double tinhChietKhau() {
        double tongTien = tinhTien();
        if (tongTien >= 500000) {
            return 0.02 * tongTien;
        }
        return 0;
    }
}
