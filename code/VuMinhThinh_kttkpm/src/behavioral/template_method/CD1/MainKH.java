package behavioral.template_method.CD1;

import java.util.ArrayList;
import java.util.List;

public class MainKH {
    public static void main(String[] args) {
        List<MatHang1> dsHangHoa = new ArrayList<>();
        dsHangHoa.add(new MatHang1("Sản phẩm 1", 2, 300000));
        dsHangHoa.add(new MatHang1("Sản phẩm 2", 3, 150000));
        dsHangHoa.add(new MatHang1("Sản phẩm 3", 1, 800000));

        KhachHang hoaDonThanThiet = new KhachHangThanThiet(dsHangHoa);
        KhachHang hoaDonKimCuong = new KhachHangKimCuong(dsHangHoa);

        System.out.println("Thông tin hóa đơn khách hàng Thân Thiết:");
        hoaDonThanThiet.hienThiGioHang();

        System.out.println("\nThông tin hóa đơn khách hàng Kim Cương:");
        hoaDonKimCuong.hienThiGioHang();
    }
}
