import java.util.HashMap;
import java.util.Map;

public class HashMap20{
    public static void main(String[] args) {
        //キーを String（名前）、値を Integer（年齢）のHashMapを作成する
        HashMap<String, Integer> people = new HashMap<>();

        //HashMapに名前と年齢のペアを追加する
        people.put("Alice", 20);
        people.put("Bob", 25);
        people.put("Charlie", 30);

        //拡張 for 文で entrySet() を利用して要素の表示する
        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue());
        }
    }
}