import java.util.HashMap;
import java.util.Map;

public class HashMap24{
    public static void main(String[] args) {
        //元の HashMap<String, Integer>を作成する
        HashMap<String, Integer> originalMap = new HashMap<>();

        //キーと値のペアをいくつか追加する
        originalMap.put("Taro", 18);
        originalMap.put("Hanako", 20);
        originalMap.put("Jiro", 22);

        //入れ替えられたキーと値のペア用の新しいHashMap<Integer, String>を作成する
        HashMap<Integer, String> swappedMap = new HashMap<>();

        //元のHashMapを反復処理し、交換したペアを新しいHashMapに配置する
        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
            String originalKey = entry.getKey();
            Integer originalValue = entry.getValue();

            swappedMap.put(originalValue, originalKey);
        }

        //入れ替えられたマップを印刷して、キーと値が逆になっていることを確認する
        System.out.println("Swapped HashMap (Integer -> String):");
        for (Map.Entry<Integer, String> entry : swappedMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}