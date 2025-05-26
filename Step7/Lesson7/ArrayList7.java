import java.util.ArrayList;
import java.util.Collections;

public class ArrayList7{
    public static void main(String[] args) {
        //1から10までの整数をArrayListに入れる
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        //ArrayListの要素をシャッフルする（Collections.shuffle メソッドを使用して）
        Collections.shuffle(numbers);

        //シャッフル後の要素を表示する（拡張 for 文を使用）
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}