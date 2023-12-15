package behavioral.observer.CA1;

import java.util.ArrayList;

public class DataAccess {
    ArrayList<MonHoc> monHocs = new ArrayList<>();

    MyStream<ArrayList<MonHoc>> myStream;

    public DataAccess(MyStream<ArrayList<MonHoc>> myStream) {
        this.myStream = myStream;
    }
    public void add(MonHoc m)
    {
        monHocs.add(m);
        myStream.addEvent(monHocs);
    }
}