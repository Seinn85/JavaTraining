import java.util.HashMap;

public class HashMap26{
    public static void main(String[] args) {
        //キーを String（名前）、値を Integer（年齢）のHashMapを作成する
        HashMap<String, Integer> map = new HashMap<>();

        //HashMapに複数のエントリ（キーと値のペア）を追加する
        map.put("Taro", 18);
        map.put("Hanako", 20);
        map.put("Jiro", 25);

        //チェックする値を指定する
        int valueToCheck = 25;

        //containsValueメソッドを使用して、値が存在するかどうかを確認する
        if (map.containsValue(valueToCheck)) {
            System.out.println("値" + valueToCheck + "は存在します。");
        } else {
            System.out.println("値" + valueToCheck + "は存在しません。");
        }
    }
}