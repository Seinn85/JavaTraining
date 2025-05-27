import java.util.Stack;

public class Stack35{

    public static int evaluateRPN(String expression){
        Stack<Integer> stack = new Stack<>();

        //入力式をスペースで分割してトークンを取得します
        String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (isNumber(token)){
                //読み込んだものが数値なら、スタックにプッシュする
                stack.push(Integer.parseInt(token));
            }else{
                //トークンは演算子です: スタックから2つの数値をポップします
                int right = stack.pop();
                int left = stack.pop();
                int result = 0;

                //演算子に基づいて操作を実行する
                switch (token) {
                    case "+":
                        result = left + right;
                        break;
                    case "-":
                        result = left - right;
                        break;
                    case "*":
                        result = left * right;
                        break;
                    case "/":
                        //整数除算
                        result = left / right;
                        break;
                    default:
                        System.out.println("不明なオペレーター: " + token);
                        return 0;
                }
                //結果をスタックにプッシュバックする
                stack.push(result);
            }
        }

        //スタックに残っている最後の数字が結果である
        return stack.pop();
    }

    //文字列が数値かどうかを確認する
    private static boolean isNumber(String str){
        try {
            Integer.parseInt(str);
            return true; //有効な番号
        } catch (NumberFormatException e) {
            return false; //数字ではない
        }
    }

    public static void main(String[] args){
        //入力
        String input = "2 3 + 4 *";
        int result = evaluateRPN(input);
        System.out.println("結果: " + result);

        //サンプル入力
        //System.out.println("Result: " + evaluateRPN("5 3 -"));       //出力 -> 2
        //System.out.println("Result: " + evaluateRPN("10 2 / 5 *"));  //出力 -> 25
    }
}