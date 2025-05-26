import java.util.ArrayList;

public class ArrayList1{
    public static void main(String[] args) {
        //ArrayListの作成（文字列型、ArrayListの変数名=fruits）
        ArrayList<String> fruits = new ArrayList<>();

        //要素の追加
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");

        //要素の表示する（拡張forループを使用）
        System.out.println("最初のリスト：");
        for(int i=0; i<fruits.size(); i++){
            System.out.println("フルーツ: " + fruits.get(i));
        }

        //要素の追加（Mangoを追加）
        fruits.add("Mango");

        //再度表示する
        System.out.println("\nMangoを追加した後のリスト：");
        for(int i=0; i<fruits.size(); i++){
            System.out.println("フルーツ: " + fruits.get(i));
        }
    }
}