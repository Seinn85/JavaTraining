package Lesson4;
import java.util.ArrayList;
import java.util.List;

public class Logger{
    //唯一のインスタンスを保持する静的フィールド
    private static Logger instance;

    //ログメッセージを格納するリスト
    private List<String> logs;

    //プライベートコンストラクタ（外部からのインスタンス化を防ぐ）
    private Logger(){
        logs = new ArrayList<>();
    }

    //インスタンスを取得するためのメソッド（スレッドセーフ）
    public static synchronized Logger getInstance(){
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    //ログメッセージを追加する
    public void log(String message){
        logs.add(message);
    }

    //全てのログを出力する
    public void printLogs(){
        System.out.println("ログ一覧:");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}