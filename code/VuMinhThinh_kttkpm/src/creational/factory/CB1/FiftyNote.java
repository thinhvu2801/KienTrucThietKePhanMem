package creational.factory.CB1;

public class FiftyNote implements CurrencyNote {
    @Override
    public void dispense(int amount) {
        int count = amount / 50;
        if (count > 0) {
            System.out.println("- " + count + " tờ mệnh giá 50");
        }
        int remainingAmount = amount % 50;
        if (remainingAmount > 0) {
            new TenNote().dispense(remainingAmount);
        }
    }
}
