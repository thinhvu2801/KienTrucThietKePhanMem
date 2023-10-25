package bt_TH.B4;

public class MainKeHoachHocTap {
    public static void main(String[] args) {
        KeHoachHocTap nam1 = new KeHoachChung("Nam 1");
        KeHoachHocTap nam2 = new KeHoachChung("Nam 2");
        KeHoachHocTap ki1 = new KeHoachChung("Ki 1");
        KeHoachHocTap ki2 = new KeHoachChung("Ki 2");
        KeHoachHocTap ki3 = new KeHoachChung("Ki 3");
        KeHoachHocTap ki4 = new KeHoachChung("Ki 4");
        KeHoachHocTap mon1 = new MonHoc("Mon 1",650,3);
        KeHoachHocTap mon2 = new MonHoc("Mon 2",500,2);
        KeHoachHocTap mon3 = new MonHoc("Mon 3",650,1);
        KeHoachHocTap mon4 = new MonHoc("Mon 4",400,2);
        KeHoachHocTap mon5 = new MonHoc("Mon 5",650,3);
        KeHoachHocTap mon6 = new MonHoc("Mon 6",500,2);
        KeHoachHocTap mon7= new MonHoc("Mon 7",650,1);
        KeHoachHocTap mon8 = new MonHoc("Mon 8",400,2);

        nam1.add(ki1);
        nam1.add(ki2);
        nam2.add(ki1);
        nam2.add(ki2);

        ki1.add(mon1);
        ki1.add(mon2);
        ki1.add(mon3);
        ki1.add(mon4);
        ki1.add(mon5);
        ki1.add(mon6);
        ki1.add(mon7);
        ki1.add(mon8);

        ki2.add(mon1);
        ki2.add(mon2);
        ki2.add(mon3);
        ki2.add(mon4);
        ki2.add(mon5);
        ki2.add(mon6);
        ki2.add(mon7);
        ki2.add(mon8);

        ki3.add(mon1);
        ki3.add(mon2);
        ki3.add(mon3);
        ki3.add(mon4);
        ki3.add(mon5);
        ki3.add(mon6);
        ki3.add(mon7);
        ki3.add(mon8);

        ki3.add(mon1);
        ki3.add(mon2);
        ki3.add(mon3);
        ki3.add(mon4);
        ki3.add(mon5);
        ki3.add(mon6);
        ki3.add(mon7);
        ki3.add(mon8);

        ki4.add(mon1);
        ki4.add(mon2);
        ki4.add(mon3);
        ki4.add(mon4);
        ki4.add(mon5);
        ki4.add(mon6);
        ki4.add(mon7);
        ki4.add(mon8);



        System.out.println( nam1.name +"\n\tTong So TC: " + ki1.getSoTC() + "\n\tTong Hoc Phi: "+ ki1.getHocPhi());
        System.out.println( nam2.name +"\n\tTong So TC: " + ki2.getSoTC() + "\n\tTong Hoc Phi: "+ ki2.getHocPhi());

    }
}
