import java.util.TreeMap;
import java.util.Map;

public class TreeMap27{
    public static void main(String[] args) {
        //整数キー（ID）と文字列値（名前）を格納するためのツリーマップを作成する
        TreeMap<Integer, String> map = new TreeMap<>();

        //キーと値のペア（IDと名前）を追加する
        map.put(1, "Taro");
        map.put(3, "Hanako");
        map.put(2, "Jiro");

        //格納した後、すべての要素を表示する
        //TreeMap はキーに対して 昇順 に自動ソートされる特性を持つ
        //出力には、最小から最大の順に並べられたキーが表示する(キーが昇順に並んでいること)
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}