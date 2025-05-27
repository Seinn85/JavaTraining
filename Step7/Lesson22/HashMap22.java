import java.util.HashMap;
import java.util.Map;

public class HashMap22{
    public static void main(String[] args) {
        //キーを String（名前）、値を Integer（年齢）のHashMapを作成する
        HashMap<String, Integer> map = new HashMap<>();

        //HashMapに名前と年齢のペアを追加する
        map.put("Taro", 18);
        map.put("Hanako", 20);
        map.put("Jiro", 22);

        //特定のキー（例: "Taro"）を remove メソッドで削除する
        map.remove("Taro");

        //削除を確認するために entry : map.entrySet()) { ... }）を使って、HashMap内のすべての要素を表示する
        System.out.println("削除後のHashMapの内容:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}