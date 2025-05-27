import java.util.HashMap;

public class HashMap21{
    public static void main(String[] args) {
        //キーを String（名前）、値を Integer（年齢）のHashMapを作成する
        HashMap<String, Integer> ageMap = new HashMap<>();

        //HashMapに名前と年齢のペアを追加する
        ageMap.put("Alice", 25);
        ageMap.put("Bob", 30);
        ageMap.put("Charlie", 22);

        //検索する名前（キー）を指定する
        String nameToFind = "Bob";

        //取得には get メソッドを使用する
        Integer age = ageMap.get(nameToFind);

        //年齢が見つかったかどうかを確認し、それを表示する
        if (age != null) {
            System.out.println(nameToFind + "'s age is " + age + ".");
        } else {
            System.out.println("The name '" + nameToFind + "' was not found.");
        }
    }
}