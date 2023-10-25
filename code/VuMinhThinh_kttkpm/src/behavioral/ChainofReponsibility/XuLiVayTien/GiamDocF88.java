package behavioral.ChainofReponsibility.XuLiVayTien;

public class GiamDocF88 implements IXuLyKhoanVay {
    String ten;
    int hanMucVay;

    public GiamDocF88(String ten, int hanMucVay) {
        this.ten = ten;
        this.hanMucVay = hanMucVay;
    }

    @Override
    public IXuLyKhoanVay capCaoHon(IXuLyKhoanVay xulyKhoanVay) {
        return null;
    }

    @Override
    public String xuLyVay(int tienvay) {
        if(tienvay <= hanMucVay)
        {
            return "Giám đốc " + ten +"Xử lý khoản vay";
        }else
        {
            return "Cook ra ngân hàng mà vay";
        }
    }
}