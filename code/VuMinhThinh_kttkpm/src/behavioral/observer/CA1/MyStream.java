package behavioral.observer.CA1;

import java.util.ArrayList;
import java.util.List;

//subject
public class MyStream<T> {

    List<Listener> ls = new ArrayList<>();
    public void addListener(Listener l){
        ls.add(l);
    }

    public void addEvent(T t)
    {
        for(Listener l : ls)
            l.listen(t);
    }

    public interface Listener<T>{
        void listen(T t);
    }

}