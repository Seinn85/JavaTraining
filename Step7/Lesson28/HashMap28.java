import java.util.HashMap;
import java.util.Map;

public class HashMap28{
    public static void main(String[] args) {
        //最初のHashMapを作成し、キーと値のペアを追加する
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);

        //2番目のHashMapを作成し、キーと値のペアを追加する
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("B", 20);
        map2.put("C", 30);
        map2.put("D", 40);

        //map2 を map1 に結合し、重複部分を map2 の値で上書きする
        map1.putAll(map2);

        //結合マップ内のすべての要素を表示する
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}