package creational.singleton.vidu;

public class MySingleton {
    private static MySingleton mySingleton;
    int count = 0;


    private MySingleton() {
    }
    public static MySingleton getMySingleton(){
        if (mySingleton==null)
            mySingleton=new MySingleton();
        return mySingleton;
    }
    public void print(){
        System.out.println(++count);
    }
}
