package behavioral.template_method.CD1;

public class MatHang1 {
    private String tenMatHang;
    private int soLuong;
    private double donGia;

    public MatHang1(String tenMatHang, int soLuong, double donGia) {
        this.tenMatHang = tenMatHang;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public double thanhTien() {
        return soLuong * donGia;
    }

    @Override
    public String toString() {
        return " Ten Mat Hang: " + tenMatHang +
                ", So Luong: " + soLuong +
                ", Don Gia: " + donGia +
                ", Thanh Tien: " + thanhTien();
    }
}
