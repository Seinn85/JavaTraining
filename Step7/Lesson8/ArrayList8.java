import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayList8{
    public static void main(String[] args) {
        //同じ整数が複数含まれる ArrayList を作成して要素を追加
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);

        //重複を削除するために LinkedHashSet に変換（順序も保持される）
        Set<Integer> set = new LinkedHashSet<>(numbers);

        //重複のない新しいリストを作成
        List<Integer> uniqueList = new ArrayList<>(set);

        //重複を削除したリストの内容を表示する（拡張 for 文を使用）
        System.out.println("重複を削除したリストの要素:");
        for (Integer num : uniqueList) {
            System.out.println(num);
        }

        System.out.println("Stream.distinct() を使用したリストの要素:");
        //Stream と distinctive() を使用して重複を削除する
        List<Integer> uniqueListDistinct = numbers.stream().distinct().collect(Collectors.toList());

        //重複を削除したリストの内容を表示する（拡張 for 文を使用）
        for (Integer num : uniqueListDistinct) {
            System.out.println(num);
        }
    }
}