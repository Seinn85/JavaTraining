import java.util.HashMap;

public class HashMap23{
    public static void main(String[] args) {
        //キーを String（名前）、値を Integer（年齢）のHashMapを作成する
        HashMap<String, Integer> map = new HashMap<>();

        //HashMapに名前と年齢のペアを追加する
        map.put("Taro", 18);
        map.put("Hanako", 20);
        map.put("Jiro", 22);

        //HashMapからキー「Taro」をremove メソッドで削除する
        map.remove("Taro");

        //map.forEach((k, v) -> ...) を使って、HashMap の中身をすべて表示する
        System.out.println("削除後のHashMapの内容:");
        map.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });
    }
}