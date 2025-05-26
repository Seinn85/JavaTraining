import java.util.LinkedList;

public class LinkedList6{
    public static void main(String[] args) {
        //LinkedListを作成
        LinkedList<String> list = new LinkedList<>();

        //文字列 "A", "B", "C", "D", "E" を順番に追加
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        //2番目の位置（インデックス1）に "X" を挿入
        list.add(1, "X");

        //4番目の要素（インデックス3）を削除
        list.remove(3);

        //最終的なLinkedListの内容を表示する
        System.out.println("最終的なLinkedListの内容:");
        for (String s : list) {
            System.out.println(s);
        }
    }
}