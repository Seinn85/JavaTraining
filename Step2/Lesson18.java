public class Lesson18 {
    public static void main(String[] args) {
        //配列の宣言と初期化
        int[] numbers = {34, 12, 25, 90, 45, 8, 67, 3, 56, 18};

        //for文を使用して、配列に格納された全ての要素を並べ替える前に表示する
        System.out.print("配列の要素: ");
        for(int i=0; i<10; i++){ 
            System.out.print(numbers[i] + " ");
        }

        //for文を使って、最大値と最小値の計算
        int max = numbers[0];
        int min = numbers[0];
        for(int i=1; i<numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i] < min){
                min = numbers[i];
            }
        }

        //改行
        System.out.println();

        //配列の中で最も大きい値と最も小さい値を表示する
        System.out.println("配列の最大値は: " + max);
        System.out.println("配列の最小値は: " + min);
    }
}