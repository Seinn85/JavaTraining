import java.util.LinkedList;
import java.util.Queue;

public class Queue34{
    public static void main(String[] args) {
        //課題 33 の操作後の Queue オブジェクト（[2, 3, 4, 5] の状態）を使用する
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        //チェック前のキューキューを表示する
        System.out.println("チェック前のキュー: " + queue);

        //最初の要素をピークする（削除せずに）
        Integer firstElement = queue.peek();  //またはqueue.element()を使用する

        //チェックされた値を表示する
        System.out.println("チェックされた値: " + firstElement);

        //キューを再度表示して、変更されていないことを確認する
        System.out.println("チェック後のキュー: " + queue);
    }
}