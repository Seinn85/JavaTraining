import java.util.HashSet;

public class HashSet10{
    public static void main(String[] args) {
        //HashSet<String> を作成する
        HashSet<String> set = new HashSet<>();

        //"A", "B", "C" を順番に追加する
        set.add("A");
        set.add("B");
        set.add("C");

        //重複する文字列をもう一度追加してみる
        boolean addedA = set.add("A"); // 2回目の "A"
        boolean addedB = set.add("B"); // 2回目の "B"

        //重複追加の結果を表示する
        System.out.println("\"A\" を2回目に追加した結果: " + addedA); // falseなら追加されなかった
        System.out.println("\"B\" を2回目に追加した結果: " + addedB);

        //最終的な HashSet の要素をすべて表示する
        System.out.println("HashSet の要素:");
        for (String s : set) {
            System.out.println(s);
        }
    }
}