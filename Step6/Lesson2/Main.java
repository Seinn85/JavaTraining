import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try{
            //ユーザーから文字列を入力
            System.out.print("文字列を入力してください: ");
            String input = scanner.nextLine();
            if (input == null || input.isEmpty()) {
                throw new NullPointerException();
            }

            //ユーザーからインデックスを入力
            System.out.print("インデックスを入力してください: ");
            int index = scanner.nextInt();

            //指定されたインデックスの文字を取得
            char result = input.charAt(index);
            System.out.println("指定されたインデックスの文字: " + result);

        }catch (StringIndexOutOfBoundsException e){
            //インデックスが範囲外の場合に発生するエラーを処理する
            System.out.println("エラー: インデックスが文字列の範囲外です。");
        }catch (NullPointerException e){
            //入力された文字列がnullの場合に発生するエラーを処理する
            System.out.println("エラー: nullの値に操作を行うことはできません。");
        }catch (Exception e){
            //その他の予期しないエラー
            System.out.println("エラー: 不明なエラーが発生しました。");
        }finally{
            System.out.println("プログラム終了");
        }
        scanner.close();
    }
}