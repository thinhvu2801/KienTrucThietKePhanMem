package creational.singleton.vidu;

public class MainSingleton {
    public static void main(String[] args) {
        MySingleton s1 = MySingleton.getMySingleton();
        MySingleton s2 = MySingleton.getMySingleton();
        s1.print();
        s1.print();
        s1.print();
        s2.print();
    }
}
