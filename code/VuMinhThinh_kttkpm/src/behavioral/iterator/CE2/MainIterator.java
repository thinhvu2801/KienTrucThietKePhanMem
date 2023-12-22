package behavioral.iterator.CE2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class MainIterator {
    public static void duyetDSMH(Iterator<MonHoc> ite, Consumer<MonHoc> consumer){
        while (ite.hasNext()){
            MonHoc m = ite.next();
            consumer.accept(m);
        }
    }

    public static void main(String[] args) {
        List<MonHoc> list = new ArrayList<>();
        list.add(new MonHoc("Toán",3));
        list.add(new MonHoc("Văn",3));
        list.add(new MonHoc("Anh",3));
        list.add(new MonHoc("Thể dục",2));

        duyetDSMH(list.iterator(), m -> {
            System.out.println("Tên Môn Học: " + m.tenMH);
            System.out.println("Số TC: " + m.soTC + "\n");
        });
    }
}