package creational.factory.CB1;

public class OneHundredNote implements CurrencyNote {
    @Override
    public void dispense(int amount) {
        int count = amount / 100;
        if (count > 0) {
            System.out.println("- " + count + " tờ mệnh giá 100");
        }
        int remainingAmount = amount % 100;
        if (remainingAmount > 0) {
            new FiftyNote().dispense(remainingAmount);
        }
    }
}
