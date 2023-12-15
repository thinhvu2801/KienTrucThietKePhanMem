package structural.decorator.B3;

public class RadioButton extends Widget {
    String label;

    public RadioButton(String label) {
        this.label = label;
    }

    @Override
    public void show() {
        System.out.println("RadioButton: " + label);
    }
}
