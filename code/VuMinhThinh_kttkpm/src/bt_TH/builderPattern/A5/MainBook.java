package bt_TH.builderPattern.A5;


public class MainBook {
    public static void main(String[] args) {
        Book b = new Book.Builder()
                .settuade("abc")
                .setsotrang(20)
                .settacgia("Abc")
                .addDSach("abc")
                .addDSach("abcas")
                .builder();
        System.out.println(b.toString());
    }
}
