//
package Lesson19;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    // 支払い方法を設定
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // 支払いを実行
    public void executePayment(int amount) {
        if (paymentStrategy != null) {
            paymentStrategy.pay(amount);
        } else {
            System.out.println("No payment method selected.");
        }
    }
}