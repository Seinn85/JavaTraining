import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileRead{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //ファイルが開かれたかどうかを確認するために、最初は null に設定されます
        BufferedReader reader = null;

        System.out.print("ファイルパスを入力してください: ");
        String filePath = scanner.nextLine();

        try{
            //FileReader は、ユーザーの入力パスで指定されたファイルを開く
            //BufferedReader は FileReader をラップして、ファイルを行単位で読み取り
            reader = new BufferedReader(new FileReader(filePath));

            System.out.println("ファイル内容:");
            String line;

            //1行ずつファイルの内容を読み取って表示
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("ファイルの内容を表示しました。");
        }catch (FileNotFoundException e){
            //指定されたファイルが存在しない場合
            System.out.println("エラー: 指定されたファイルが見つかりません。");
        }catch (IOException e){
            //読み取ったファイルが空の場合
            System.out.println("エラー: ファイルの読み取り中に問題が発生しました。");
        }finally {
            //リソースを必ず閉じる処理
            try{
                if (reader != null){
                    reader.close();
                }
            }catch (IOException e){
                System.err.println("エラー: ファイルを閉じることができませんでした。");
            }
        }
        System.out.println("プログラム終了");
        scanner.close();
    }
}