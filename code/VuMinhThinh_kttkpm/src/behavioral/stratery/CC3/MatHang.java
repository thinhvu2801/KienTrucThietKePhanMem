package behavioral.stratery.CC3;

import java.util.ArrayList;
import java.util.List;
    
public class MatHang {
    String tenMH;
    int soLuong, donGia;

    List<MatHang>list= new ArrayList<>();
    public MatHang(String tenMH, int soLuong, int donGia) {
        this.tenMH = tenMH;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
}