public class BankAccount {
    //残高を作成、速度の初期値は0にする
    private int balance = 0;

    //預け入れ（deposit）メソッド

    public void deposit(int amount){
        balance += amount;
        if (balance <= 0){
            System.out.println("預け入れ金額は1円以上にしてください");
        }else{
            System.out.println(balance + "円を預け入れました。");
        }
    }

    //引き出し（withdraw）メソッド
    public void withdraw(int amount){
        balance -= amount;
        if (balance <= 0){
            System.out.println("引き出しは1円以上で、残高以内で行ってください");
        }else{
            System.out.println(amount + "円を引き出しました。");
        }
    }

    //現在の残高を表示するメソッド（showBalance）
    public void showBalance(){
        System.out.println("現在の残高: " + balance + "円");
    }
}