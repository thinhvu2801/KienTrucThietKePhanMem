package behavioral.ChainofReponsibility.XuLiVayTien;

public class MainXuLyKhoanVay {
    public static void main(String[] args) {
        IXuLyKhoanVay gacCong = new NhanVienF88("Vinh", "Gác cổng",100);
        IXuLyKhoanVay giuXe = new NhanVienF88("Lập", "Giữ Xe",150);
        IXuLyKhoanVay truongPhong = new NhanVienF88("Huy", "Trưởng phòng",200);
        IXuLyKhoanVay giamDoc = new GiamDocF88("Thịnh",500);
        gacCong.capCaoHon(gacCong)
                .capCaoHon(giuXe)
                .capCaoHon(truongPhong)
                .capCaoHon(giamDoc);
        System.out.println(gacCong.xuLyVay(550));
    }
}