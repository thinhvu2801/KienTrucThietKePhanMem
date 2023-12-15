package behavioral.observer.CA2;

public class Activity implements MyButton.OnClickListener {
    MyButton myButton;
    int n = 0;

    public Activity(MyButton myButton) {
        this.myButton = myButton;
        myButton.attach(this);
    }

    public void huyClick() {
        myButton.detach();
    }

    @Override
    public void OnClick() {
        n++;
        System.out.println("bạn click lần thứ " + n);
    }
}