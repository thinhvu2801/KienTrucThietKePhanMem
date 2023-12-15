package behavioral.observer.CA1;

import java.util.ArrayList;

public class MainStream {
    public static void main(String[] args) {
        MyStream<ArrayList<MonHoc>> myStream = new MyStream<>();
        DataAccess dataAccess = new DataAccess(myStream);
        Client client = new Client(myStream);

        dataAccess.add(new MonHoc("MH01","Toán",3));
        dataAccess.add(new MonHoc("MH02","Văn",3));
        dataAccess.add(new MonHoc("MH03","Anh",3));
        dataAccess.add(new MonHoc("MH04","Lý",2));


    }
}