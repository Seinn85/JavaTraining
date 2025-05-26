import java.util.ArrayList;

public class ArrayList5{
    public static void main(String[] args) {
        //ArrayListを作成
        ArrayList<Integer> list = new ArrayList<>();

        //1から5まで順番に追加
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }

        //元の順番を変更せずに逆順で表示する
        System.out.println("逆順に表示:");
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        //確認のため元の順番も表示する
        System.out.println("元の順番:");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}