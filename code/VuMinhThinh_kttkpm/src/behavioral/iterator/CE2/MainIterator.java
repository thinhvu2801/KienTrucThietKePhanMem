package behavioral.iterator.CE2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainIterator {
    public static void inDSMH(Iterator<MonHoc> ite){
        while (ite.hasNext()){
            MonHoc m = ite.next();
            System.out.println("Tên Môn Học: " + m.tenMH);
            System.out.println("Số TC: " + m.soTC + "\n");
        }
    }

    public static void main(String[] args) {
        List<MonHoc> list = new ArrayList<>();
        list.add(new MonHoc("Toán",3));
        list.add(new MonHoc("Văn",3));
        list.add(new MonHoc("Anh",3));
        list.add(new MonHoc("Thể dục",2));

        Iterator<MonHoc> iterator = list.iterator();
        inDSMH(iterator);

    }
}