package Lesson3;

public class BankAccount {
    private int accountNumber;
    private int balance;

    //口座番号と初期残高を設定するコンストラクター
    public BankAccount(int accountNumber, int initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    //口座番号の取得
    public int getAccountNumber() {
        return accountNumber;
    }

    //バランス ゲッター
    public int getBalance() {
        return balance;
    }

    // 入金メソッド
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " 円を入金しました。");
        } else {
            System.out.println("入金額が無効です。");
        }
    }

    // 引き出しメソッド
    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("引き出し金額が無効です。");
        } else if (amount > balance) {
            System.out.println("残高が不足しています。");
        } else {
            balance -= amount;
            System.out.println(amount + " 円を引き出した。");
        }
    }
}