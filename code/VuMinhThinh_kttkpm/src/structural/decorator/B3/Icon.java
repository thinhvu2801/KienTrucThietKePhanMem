package structural.decorator.B3;

public class Icon extends Widget {
    String iconName;

    public Icon(String iconName) {
        this.iconName = iconName;
    }

    @Override
    public void show() {
        System.out.println("Icon: " + iconName);
    }
}
