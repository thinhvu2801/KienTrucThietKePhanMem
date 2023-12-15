package creational.factory.CB1;

import java.util.Scanner;

public class MainATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền cần rút: ");
        int amount = scanner.nextInt();

        CurrencyNote currencyNote = CurrencyNoteFactory.createCurrencyNote();
        currencyNote.dispense(amount);
    }
}
