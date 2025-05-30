//
package Lesson19;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Processing payment of $" + amount + " using Credit Card...");
    }
}