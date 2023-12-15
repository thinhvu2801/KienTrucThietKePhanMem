package structural.decorator.B3;

public class Text extends Widget{
    String context;

    public Text(String context) {
        this.context = context;
    }

    @Override
    public void show() {
        System.out.println(context);
    }
}
