package structural.decorator.B3;


public class Center extends WidgetDecorator {

    public Center(Widget child) {
        super(child);
    }

    @Override
    public void show() {
        System.out.println("<center>");
        System.out.print("\t\t");
        child.show();
        System.out.println("\t</center>");
    }
}
