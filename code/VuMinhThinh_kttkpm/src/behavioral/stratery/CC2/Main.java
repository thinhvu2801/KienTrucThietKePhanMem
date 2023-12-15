package behavioral.stratery.CC2;

public class Main {
    public static void main(String[] args) {
        QLSV qlsv = new QLSV();
        qlsv.dsSV.add(new SinhVien("Thinh", 8.5f));
        qlsv.dsSV.add(new SinhVien("Vinh", 7.2f));
        qlsv.dsSV.add(new SinhVien("Huy", 9.0f));

        qlsv.sapXep(new SoSanhTheoDiem());
        qlsv.inDS();
    }
}
