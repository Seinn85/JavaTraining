package Lesson3;

public class Main {
    public static void main(String[] args) {
        //口座番号123456、初期残高10,000のBankAccountオブジェクトを作成する
        BankAccount myAccount = new BankAccount(123456, 10000);

        //口座番号と初期残高を表示する
        System.out.println("口座番号: " + myAccount.getAccountNumber());
        System.out.println("初期残高: " + myAccount.getBalance() + " yen");

        //預かり金5000円
        myAccount.deposit(5000);

        //引き出し金3000円
        myAccount.withdraw(3000);

        //最終残高を表示
        System.out.println("最終残高: " + myAccount.getBalance() + " yen");
    }
}