//ノードを表すクラス
class Node {
    int data;  //データを入れる変数
    Node next; //次のノードを指す変数（参照）

    //コンストラクタ（ノード作るとき使う）
    Node(int data) {
        this.data = data;  //データをセット
        this.next = null;  //次のノードはまだない（null）
    }
}

// シングルリンクリストを表すクラス
class SingleLinkedList {
    private Node head;  //リストの最初のノード（ヘッド）

    //新しいデータをリストの最後に追加するメソッド
    public void add(int data) {
        Node newNode = new Node(data); //新しいノードを作る

        if (head == null) {  //リストが空なら
            head = newNode;   //新しいノードをヘッドにする
        } else {
            Node current = head;  //ヘッドから始める
            while (current.next != null) {  //次のノードがある間、進む
                current = current.next;
            }
            current.next = newNode;  //最後のノードの次に新しいノードをつなげる
        }
    }

    //指定した値がリストにあるか調べるメソッド
    public boolean search(int target) {
        Node current = head;  //ヘッドからスタート
        while (current != null) {  //ノードがある間、調べる
            if (current.data == target) {  //データが見つかったら
                return true;  //見つかったよ
            }
            current = current.next;  //次のノードへ
        }
        return false;  //見つからなかった
    }

    //指定した値を持つノードをリストから削除するメソッド
    public void delete(int target) {
        if (head == null) return;  //リストが空なら何もしない

        if (head.data == target) {  //ヘッドが削除対象なら
            head = head.next;       //ヘッドを次のノードに変える（削除）
            return;
        }

        Node current = head;  //ヘッドから始める
        //削除対象のノードの一つ前まで進む
        while (current.next != null && current.next.data != target) {
            current = current.next;
        }

        //削除対象のノードが見つかったらつなぎ変える
        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    //リストの中身を表示するメソッド
    public void display() {
        Node current = head;  //ヘッドからスタート
        while (current != null) {  //ノードがある間、表示
            System.out.print(current.data + " → ");
            current = current.next;  //次のノードへ
        }
        System.out.println("null");  //リストの終わり
    }
}

//メインクラス（プログラムの始まり）
public class SingleLinkedListNode {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();  //リストを作る

        //リストに要素を追加
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("After adding elements:");
        list.display();  //リストを表示

        //探したい値を設定
        int target1 = 20;
        int target2 = 40;

        //探して結果を表示
        System.out.println("Searching for " + target1 + ": " + (list.search(target1) ? "Found" : "Not found"));
        System.out.println("Searching for " + target2 + ": " + (list.search(target2) ? "Found" : "Not found"));

        //削除してリスト表示
        list.delete(20);
        System.out.println("After deleting 20:");
        list.display();
    }
}