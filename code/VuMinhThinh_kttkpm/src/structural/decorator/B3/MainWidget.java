package structural.decorator.B3;

public class MainWidget {
    public static void main(String[] args) {
        Widget text = new Text("Vu Minh Thinh");
        Widget center = new Center(text);
        Widget button = new Button(center);
        //center.show();
        button.show();
    }
}
