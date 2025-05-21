import java.util.Random;

public class Lesson16 {
    public static void main(String[] args) {
        //長さが10の整数型の配列を宣言する
        int[] numbers;
        numbers = new int[10];

        //ランダムな整数の生成
        Random random = new Random();
        //0～100 の範囲でランダムな整数を生成し、配列の各要素に格納する
        for(int i=0; i<10; i++){
            numbers[i] = random.nextInt(101);          
        }
        //for文を使用して、配列に格納された全ての整数を順番に表示する
        for(int i=0; i<10; i++){
            System.out.println("配列の要素 " + (i+1) + ": " + numbers[i]);         
        }
    }
}