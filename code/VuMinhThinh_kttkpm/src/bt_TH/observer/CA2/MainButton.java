package bt_TH.observer.CA2;

public class MainButton {
    public static void main(String[] args) {
        MyButton myButton = new MyButton();
        Activity activity1 = new Activity(myButton);

        myButton.Click();
        myButton.Click();
        myButton.Click();

        activity1.huyClick();

        myButton.Click();
    }
}
