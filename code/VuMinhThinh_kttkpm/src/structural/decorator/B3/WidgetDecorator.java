package structural.decorator.B3;

public abstract class WidgetDecorator extends Widget {
    Widget child;

    public WidgetDecorator(Widget child) {
        this.child = child;
    }

    @Override
    public void show() {

    }
}
