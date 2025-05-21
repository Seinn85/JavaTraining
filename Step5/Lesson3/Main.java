public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.showBalance(); // 初期残高を表示
        myAccount.deposit(5000); // 5000円を預け入れ
        myAccount.showBalance(); // 残高を表示
        myAccount.withdraw(2000); // 2000円を引き出し
        myAccount.showBalance(); // 残高を表示
        myAccount.withdraw(5000); // 残高不足で引き出しエラー
    }
}