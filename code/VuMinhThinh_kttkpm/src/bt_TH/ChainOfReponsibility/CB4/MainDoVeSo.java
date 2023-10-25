package bt_TH.ChainOfReponsibility.CB4;

public class MainDoVeSo {
    public static void main(String[] args) {
        IDoVeSo giaiTu =new GiaiThuong("Giai Tu", new String[]
                {"03184",
                "60843",
                "05923",
                "11367",
                "02679",
                "18854",
                "79640"});
        IDoVeSo giaiBa =new GiaiThuong("Giai Ba", new String[]
                {"69030",
                "65815"});
        IDoVeSo giaiNhi =new GiaiThuong("Giai Nhi", new String[]
                {"24984"});
        IDoVeSo giaiNhat =new GiaiThuong("Giai Nhat", new String[]
                {"81171"});
        IDoVeSo giaiDacBiet =new GiaiThuong("Giai Dac Biet", new String[]
                {"848688"});
        IDoVeSo giaiTam = new GiaiUt("Giai Ut",new String[]{"22"});
        giaiDacBiet.giaiKeTiep(giaiDacBiet)
                .giaiKeTiep(giaiNhat)
                .giaiKeTiep(giaiNhi)
                .giaiKeTiep(giaiBa)
                .giaiKeTiep(giaiTu)
                .giaiKeTiep(giaiTam);

        System.out.println(giaiDacBiet.doVeSo("498522"));
    }
}
