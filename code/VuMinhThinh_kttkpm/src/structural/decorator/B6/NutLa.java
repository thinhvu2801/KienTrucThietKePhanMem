package structural.decorator.B6;

public class NutLa implements Nut {
    String content;

    public NutLa(String content) {
        this.content = content;
    }

    @Override
    public void add(Nut n) {
    }

    @Override
    public void remove(Nut n) {
    }

    @Override
    public void duyetCay() {
        System.out.println("Nut La: " + content);
    }
}
