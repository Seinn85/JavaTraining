//
package Lesson19;

public class BankTransferPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Processing payment of $" + amount + " using Bank Transfer...");
    }
}