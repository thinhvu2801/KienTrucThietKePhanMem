package behavioral.observer.CA1;

import java.util.ArrayList;

public class Client implements MyStream.Listener<ArrayList<MonHoc>> {

    public Client(MyStream<ArrayList<MonHoc>> myStream){
        myStream.addListener(this);

    }

    @Override
    public void listen(ArrayList<MonHoc> monHocs) {
        System.out.println(monHocs.size());
        for(MonHoc m: monHocs)
        {
            System.out.println(m.toString());
        }
    }
}