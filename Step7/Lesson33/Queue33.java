import java.util.LinkedList;
import java.util.Queue;

public class Queue33{
    public static void main(String[] args) {
        //操作前: 課題 32 で作成した Queue ([1, 2, 3, 4, 5])
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        //操作前にキューを表示する
        System.out.println("操作前のQueue: " + queue);

        //Remove() または Poll() を使用して 1 つの要素をキューから削除する
        //どちらも似たようなことを行います。より安全なpoll()を使用します（空の場合はnullを返します）
        Integer removedElement = queue.poll();

        //削除された値を表示する
        System.out.println("取り出された値: " + removedElement);

        //操作後にキューを表示する
        System.out.println("操作後のQueue: " + queue);
    }
}