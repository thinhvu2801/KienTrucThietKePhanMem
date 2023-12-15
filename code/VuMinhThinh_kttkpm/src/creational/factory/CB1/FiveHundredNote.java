package creational.factory.CB1;

public class FiveHundredNote implements CurrencyNote {
    @Override
    public void dispense(int amount) {
        int count = amount / 500;
        if (count > 0) {
            System.out.println("- " + count + " tờ mệnh giá 500");
        }
        int remainingAmount = amount % 500;
        if (remainingAmount > 0) {
            new OneHundredNote().dispense(remainingAmount);
        }
    }
}
