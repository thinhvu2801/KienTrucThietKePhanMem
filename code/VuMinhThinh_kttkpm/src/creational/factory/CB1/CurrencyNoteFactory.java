package creational.factory.CB1;

public class CurrencyNoteFactory {
    public static CurrencyNote createCurrencyNote() {
        // In this example, always create a FiveHundredNote
        return new FiveHundredNote();
    }
}
