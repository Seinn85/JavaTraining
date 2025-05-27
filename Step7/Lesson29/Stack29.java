import java.util.Stack;

public class Stack29{
    public static void main(String[] args) {
        //整数型のスタックを作成する
        Stack<Integer> stack = new Stack<>();

        //1から5までの値を指定された順序でプッシュ（追加）する
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        //スタックの内容を表示する
        //角括弧内に下から上への要素を表示する
        System.out.println("Stack contents: " + stack);
    }
}