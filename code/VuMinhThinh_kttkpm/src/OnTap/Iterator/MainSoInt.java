package OnTap.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainSoInt {
    public static void inSo(Iterator<SoInt> soIntIterator){
        while (soIntIterator.hasNext()){
            SoInt soInt = soIntIterator.next();
            System.out.println("So: "+ soInt.num);
        }
    }

    public static void main(String[] args) {
        List<SoInt> soIntList = new ArrayList<>();
        soIntList.add(new SoInt(1));
        soIntList.add(new SoInt(2));
        soIntList.add(new SoInt(3));
        soIntList.add(new SoInt(4));

        Iterator<SoInt> soIntIterator = soIntList.iterator();
        inSo(soIntIterator);
    }
}
