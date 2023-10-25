package bt_TH.ChainOfReponsibility.CB4;

public class GiaiUt implements IDoVeSo{
    String tenGiai;
    String[] soTrungThuongs;

    public GiaiUt(String tenGiai, String[] soTrungThuong) {
        this.tenGiai = tenGiai;
        this.soTrungThuongs = soTrungThuong;
    }

    @Override
    public IDoVeSo giaiKeTiep(IDoVeSo keTiep) {
        return null;
    }

    @Override
    public String doVeSo(String veSo) {
        for (String s:soTrungThuongs)
            if(veSo.endsWith(s))
                return "Ban da trung: "+tenGiai;
        return "Chuc ban may man lan sau";
    }
}
