import java.util.Stack;

public class Stack36{

    public static int evaluateRPN(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split(" ");  // Split by space

        for (String token : tokens){
            if (isOperator(token)){
                //右オペランドを最初にポップする
                int right = stack.pop();
                int left = stack.pop();
                int result = calculate(left, right, token);
                stack.push(result);
            }else{
                //トークンは数字で、スタックにプッシュされます
                stack.push(Integer.parseInt(token));
            }
        }

        //スタックに残る唯一の値は結果です
        return stack.pop();
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    private static int calculate(int left, int right, String operator) {
        switch (operator) {
            case "+": return left + right;
            case "-": return left - right;
            case "*": return left * right;
            case "/": return left / right;
            default: throw new IllegalArgumentException("無効な演算子: " + operator);
        }
    }

    public static void main(String[] args) {
        String input = "2 3 + 4 *";
        int result = evaluateRPN(input);
        System.out.println("結果: " + result);
    }
}