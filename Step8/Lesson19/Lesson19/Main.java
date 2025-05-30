//ストラテジーパターンを使った「支払い方法の選択システム」
package Lesson19;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // クレジットカードで支払い
        processor.setPaymentStrategy(new CreditCardPayment());
        processor.executePayment(100);

        // PayPalで支払い
        processor.setPaymentStrategy(new PayPalPayment());
        processor.executePayment(200);

        // 銀行振込で支払い
        processor.setPaymentStrategy(new BankTransferPayment());
        processor.executePayment(300);
    }
}