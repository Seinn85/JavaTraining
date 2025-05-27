import java.util.Stack;

public class Stack30{
    public static void main(String[] args) {
        //整数型のスタックを作成する
        Stack<Integer> stack = new Stack<>();

        //1から5までの値を指定された順序でプッシュ（追加）する
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        //pop 前にStackの内容を表示する
        System.out.println("pop 前: " + stack);

        //一番上の要素をポップする（削除して取得する）
        int poppedValue = stack.pop();

        //ポップした値を出力する
        System.out.println("ポップした値: " + poppedValue);

        //pop 後にStackの内容を表示する
        System.out.println("pop 後: " + stack);
    }
}