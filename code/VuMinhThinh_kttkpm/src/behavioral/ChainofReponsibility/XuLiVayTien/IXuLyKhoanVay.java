package behavioral.ChainofReponsibility.XuLiVayTien;

public interface IXuLyKhoanVay {
    IXuLyKhoanVay capCaoHon(IXuLyKhoanVay xulyKhoanVay);
    String xuLyVay(int tienvay);
}