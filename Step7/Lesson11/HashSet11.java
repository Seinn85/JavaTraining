import java.util.HashSet;

public class HashSet11{
    public static void main(String[] args) {
        //HashSet を作成
        HashSet<String> languages = new HashSet<>();

        //複数の文字列を追加
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Go");

        //"Java" を削除する
        languages.remove("Java");

        //拡張 for 文で HashSet の要素をすべて表示する
        System.out.println("HashSet の内容（\"Java\" 削除後）:");
        for (String lang : languages) {
            System.out.println(lang);
        }
    }
}