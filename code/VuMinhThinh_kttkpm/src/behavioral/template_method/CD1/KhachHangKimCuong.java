package behavioral.template_method.CD1;

import java.util.List;

public class KhachHangKimCuong extends KhachHang {
    public KhachHangKimCuong(List<MatHang1> dsHangHoa) {
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
        if (tongTien >= 500000 && tongTien < 1000000) {
            return 0.03 * tongTien;
        } else if (tongTien >= 1000000 && tongTien < 1500000) {
            return 0.05 * tongTien;
        } else if (tongTien >= 1500000) {
            return 0.06 * tongTien;
        }
        return 0;
    }
}
