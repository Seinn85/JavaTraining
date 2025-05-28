package Lesson4;

public class Main {
    public static void main(String[] args){
        //Loggerのインスタンスを取得
        Logger logger1 = Logger.getInstance();

        //ログメッセージを追加
        logger1.log("メッセージ1: 起動しました。");
        logger1.log("メッセージ2: 初期化完了。");

        //別の場所（別の変数）でもLoggerのインスタンスを取得
        Logger logger2 = Logger.getInstance();

        //追加のログメッセージを記録
        logger2.log("メッセージ3: ユーザーログイン成功。");

        //すべてのログを出力
        logger2.printLogs();

        //インスタンスが同一かどうか確認
        if (logger1 == logger2){
            System.out.println("logger1とlogger2は同じインスタンスです。");
        }else{
            System.out.println("logger1とlogger2は異なるインスタンスです。");
        }
    }
}