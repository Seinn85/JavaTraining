import java.util.Stack;

public class Stack31{
    public static void main(String[] args) {
        //整数型のスタックを作成する
        //課題 30 の操作後の Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        //peek() を使用して、一番上の要素（4）を削除せずにチェックする
        int topElement = stack.peek();

        //peek() で取得した値を表示する
        System.out.println("ピーク値: " + topElement);

        //ピーク後にスタックの内容を表示して変更されていないことを示す
        System.out.println("ピーク後のスタック: " + stack);
    }
}