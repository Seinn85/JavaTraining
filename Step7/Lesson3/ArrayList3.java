import java.util.ArrayList;

public class ArrayList3{
    public static void main(String[] args) {
        //ArrayList を作成して 1～5 を順番に追加
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //値が「3」の要素を削除（インデックスを指定せず、値で削除）
        numbers.remove(Integer.valueOf(3));

        //3番目の要素（インデックスは 2）を削除
        numbers.remove(2);

        //ArrayList の全要素を表示する（for 文を使う）
        System.out.println("for メソッドを使用して、ArrayList の全要素を表示する");
        for(int i=0; i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        //ArrayList の全要素を表示する（拡張 for 文を使う）
        System.out.println("拡張 for メソッドを使用して、ArrayList の全要素を表示する");
        for (int num : numbers) {
            System.out.println(num);
        }

        //ArrayList の全要素を表示する（拡張 forEach 文を使う）
        System.out.println("forEach メソッドを使用して、ArrayList の全要素を表示する");
        numbers.forEach(number -> {System.out.println(number);});
    }
}