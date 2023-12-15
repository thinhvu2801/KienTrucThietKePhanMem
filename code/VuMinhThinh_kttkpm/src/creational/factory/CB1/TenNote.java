package creational.factory.CB1;

public class TenNote implements CurrencyNote {
    @Override
    public void dispense(int amount) {
        int count = amount / 10;
        if (count > 0) {
            System.out.println("- " + count + " tờ mệnh giá 10");
        }
        int remainingAmount = amount % 10;
        if (remainingAmount > 0) {
            new OneNote().dispense(remainingAmount);
        }
    }
}
