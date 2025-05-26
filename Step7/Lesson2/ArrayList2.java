import java.util.ArrayList;

public class ArrayList2{
    public static void main(String[] args) {
        //整数を格納するための ArrayList を作成
        ArrayList<Integer> numbers = new ArrayList<>();

        //ArrayList に、1から5の値を順に追加
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //拡張 for メソッドを使用する
        System.out.println("拡張 for メソッドを使用する");
        for (int number : numbers) {
            System.out.println(number);
        }

        //forEach メソッドを使用する
        System.out.println("forEach メソッドを使用する");
        numbers.forEach(number -> {System.out.println(number);});
    }
}