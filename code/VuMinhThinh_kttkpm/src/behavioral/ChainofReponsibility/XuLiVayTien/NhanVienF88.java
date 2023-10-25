package behavioral.ChainofReponsibility.XuLiVayTien;

public class NhanVienF88 implements IXuLyKhoanVay {
    IXuLyKhoanVay capCaoHon;
    String ten, chucVu;
    int hanMucVay;

    public NhanVienF88(String ten, String chucVu, int hanMucVay) {
        this.ten = ten;
        this.chucVu = chucVu;
        this.hanMucVay = hanMucVay;
    }

    @Override
    public IXuLyKhoanVay capCaoHon(IXuLyKhoanVay xulyKhoanVay) {
        capCaoHon = xulyKhoanVay;
        return xulyKhoanVay;
    }

    @Override
    public String xuLyVay(int tienvay) {
        if(tienvay <= hanMucVay)
        {
            return chucVu + " " + ten +" " + "xử lý khoản vay";
        }else {
            return capCaoHon.xuLyVay(tienvay);
        }
    }
}