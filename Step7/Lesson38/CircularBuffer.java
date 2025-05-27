import java.util.LinkedList;
import java.util.Queue;

public class CircularBuffer<T> {
    private Queue<T> queue;
    private int maxSize;

    //最大サイズを設定するコンストラクタ
    public CircularBuffer(int size) {
        this.maxSize = size;
        this.queue = new LinkedList<>();
    }

    //バッファに要素を追加するメソッド
    public void addElement(T element) {
        //バッファがいっぱいの場合は、最も古い要素を削除します
        if (queue.size() == maxSize) {
            queue.poll();  //ヘッド（最も古い要素）を削除
        }
        //キューの最後に新しい要素を追加する
        queue.offer(element);
    }

    //バッファの内容を表示する
    public void displayBuffer() {
        System.out.println(queue);
    }

    public static void main(String[] args) {
        CircularBuffer<Integer> buffer = new CircularBuffer<>(3);

        buffer.addElement(1);
        buffer.displayBuffer();

        buffer.addElement(2);
        buffer.displayBuffer();

        buffer.addElement(3);
        buffer.displayBuffer();

        buffer.addElement(4);
        buffer.displayBuffer();

        buffer.addElement(5);
        buffer.displayBuffer();
    }
}