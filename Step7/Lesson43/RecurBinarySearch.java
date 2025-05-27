public class RecurBinarySearch {
    //ノードクラス：木の1つの部分（数字と左右の枝）
    static class Node {
        int value;     //ノードの数字
        Node left;     //左の枝
        Node right;    //右の枝

        //ノードを作るときに数字を入れる
        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    //木のクラス：数字を入れたり、探したりする
    static class BinarySearchTree {
        Node root; //木の一番上のノード

        //数字を木に入れる
        public void insert(int value) {
            root = insertRecursive(root, value);
        }

        //中で使うメソッド（再帰で入れる）
        private Node insertRecursive(Node current, int value) {
            //何もないところに新しいノードを作る
            if (current == null) {
                return new Node(value);
            }

            //小さいなら左へ
            if (value < current.value) {
                current.left = insertRecursive(current.left, value);
            }
            //大きいなら右へ
            else if (value > current.value) {
                current.right = insertRecursive(current.right, value);
            }

            return current;
        }

        //数字を探す
        public boolean search(int value) {
            return searchRecursive(root, value);
        }

        //中で使うメソッド（再帰で探す）
        private boolean searchRecursive(Node current, int value) {
            //見つからなかったら false を返す
            if (current == null) {
                return false;
            }

            //同じ数字なら true を返す
            if (value == current.value) {
                return true;
            }
            //小さいなら左で探す
            else if (value < current.value) {
                return searchRecursive(current.left, value);
            }
            //大きいなら右で探す
            else {
                return searchRecursive(current.right, value);
            }
        }
    }

    //メインメソッド：木を使ってテストする
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        //木に数字を入れる
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        //数字を探す
        System.out.println("60 を探す: " + bst.search(60));  //true
        System.out.println("25 を探す: " + bst.search(25));  //false
        System.out.println("80 を探す: " + bst.search(80));  //true
        System.out.println("10 を探す: " + bst.search(10));  //false
    }
}