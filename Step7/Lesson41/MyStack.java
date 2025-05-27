public class MyStack {
    private int[] stackArray;  //スタックにいれる数字をしまう はこ（配列）
    private int top;           //いちばん上のばしょ（インデックス）
    private int capacity;      //スタックの大きさ（最大いれられる数）

    //コンストラクター（さいしょにスタックをつくる）
    public MyStack(int size) {
        capacity = size;
        stackArray = new int[capacity]; //スタックのはこをつくる
        top = -1; //スタックは まだなにもない（から）
    }

    //pushメソッド：スタックに数字をいれる
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("スタックはいっぱいです！" + value + " はいれられません。");
        } else {
            top++; //いちばん上のばしょをひとつ上にする
            stackArray[top] = value; //そのばしょに数字をいれる
            System.out.println("いれた： " + value);
        }
    }

    //popメソッド：スタックのいちばん上の数字をとりだす
    public int pop() {
        if (top == -1) {
            System.out.println("スタックはからです！とりだせません。");
            return -1; //なにもないときのサイン
        } else {
            int poppedValue = stackArray[top]; //いちばん上の数字をとる
            top--; //いちばん上をひとつ下にする
            System.out.println("とりだした： " + poppedValue);
            return poppedValue;
        }
    }

    //peekメソッド：スタックのいちばん上の数字をみる（とらない）
    public int peek() {
        if (top == -1) {
            System.out.println("スタックはからです！みれません。");
            return -1;
        } else {
            System.out.println("みえた： " + stackArray[top]);
            return stackArray[top];
        }
    }

    //スタックをためすメインプログラム
    public static void main(String[] args) {
        MyStack stack = new MyStack(5); //スタックをつくる（大きさ5）

        stack.push(10); // いれる
        stack.push(20);
        stack.push(30);
        stack.peek();   // 30 がみえる
        stack.pop();    // 30 がきえる
        stack.peek();   // 20 がみえる
        stack.pop();    // 20 がきえる
        stack.pop();    // 10 がきえる
        stack.pop();    // なにもないので、エラーがでる
        stack.push(40); // またいれる
        stack.peek();   // 40 がみえる

        //つづけていれて、スタックをいっぱいにする
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80); //もういっぱいなので、はいれない
    }
}