package structural.decorator.B3;


public class Button extends WidgetDecorator {

    public Button(Widget child) {
        super(child);
    }

    @Override
    public void show() {
        System.out.println("<button>");
        System.out.print("\t");
        child.show();
        System.out.println("</button>");
    }
}
