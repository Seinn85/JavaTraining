import java.util.ArrayList;

public class ArrayList9{
    public static void main(String[] args) {
        //Integer型のArrayListを作成する
        ArrayList<Integer> numbers = new ArrayList<>();

        //1から10までの整数を順に追加する
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        //中間の要素のインデックスを計算する
        //インデックスは0から始まるので4番目
        int middleIndex = numbers.size() / 2-1;

        //中間の要素を取得する
        int middleValue = numbers.get(middleIndex);

        //中間の要素の値を表示する
        System.out.println("中間の要素（インデックス " + middleIndex + "）の値は: " + middleValue);
    }
}