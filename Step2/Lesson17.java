public class Lesson17 {
    public static void main(String[] args) {
        //配列の宣言と初期化
        int[] numbers = {34, 12, 25, 90, 45, 8, 67, 3, 56, 18};

        //for文を使用して、配列に格納された全ての要素を並べ替える前に表示する
        System.out.print("並べ替え前の配列: ");
        for(int i=0; i<10; i++){ 
            System.out.print(numbers[i] + " ");
        }

        //バブルソートを使って配列の要素を昇順に並べ替え
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    //隣り合う要素を交換
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        //改行
        System.out.println();

        //並べ替え後の配列を表示する
        System.out.print("並べ替え後の配列: ");
        for(int num: numbers){
            System.out.print(num + " ");
        }
    }
}