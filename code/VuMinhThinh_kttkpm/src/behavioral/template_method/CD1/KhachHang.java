package behavioral.template_method.CD1;

import java.util.List;

abstract class KhachHang {
    protected List<MatHang1> dsHangHoa;

    public KhachHang(List<MatHang1> dsHangHoa) {
        this.dsHangHoa = dsHangHoa;
    }

    public abstract double tinhTien();

    public abstract double tinhChietKhau();

    public void hienThiGioHang() {
        System.out.println("Thông tin giỏ hàng:");
        for (MatHang1 matHang : dsHangHoa) {
            System.out.println(matHang);
        }
        System.out.println("Tổng tiền mua hàng: " + tinhTien());
        System.out.println("Tiền chiết khấu: " + tinhChietKhau());
        System.out.println("Tiền khách hàng cần thanh toán: " + (tinhTien() - tinhChietKhau()));
    }
}
