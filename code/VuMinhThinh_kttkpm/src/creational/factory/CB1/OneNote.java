package creational.factory.CB1;

public class OneNote implements CurrencyNote {
    @Override
    public void dispense(int amount) {
        int count = amount;
        if (count > 0) {
            System.out.println("- " + count + " tờ mệnh giá 1");
        }
    }
}
