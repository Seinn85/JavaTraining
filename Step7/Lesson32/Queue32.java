import java.util.LinkedList;
import java.util.Queue;

public class Queue32{
    public static void main(String[] args) {
        //LinkedList を使用して整数のキューを作成する
        Queue<Integer> queue = new LinkedList<>();

        //1から5までの整数を順番に足す
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        //キューの内容を表示する
        System.out.println(queue);
    }
}