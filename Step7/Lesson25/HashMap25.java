import java.util.HashMap;

public class HashMap25{
    public static void main(String[] args) {
        //キーを String（名前）、値を Integer（年齢）のHashMapを作成する
        HashMap<String, Integer> map = new HashMap<>();

        //HashMapに複数のエントリ（キーと値のペア）を追加する
        map.put("Taro", 18);
        map.put("Hanako", 20);
        map.put("Jiro", 22);

        //チェックするキーを指定する
        String keyToCheck = "Hanako";

        //containsKeyメソッドを使用して、キーが存在するかどうかを確認する
        if (map.containsKey(keyToCheck)) {
            System.out.println(keyToCheck + "は存在します。");
        } else {
            System.out.println(keyToCheck + "は存在しません。");
        }
    }
}