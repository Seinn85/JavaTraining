//Node クラス：木の1つの場所を表す
class Node {
    int value;    // 数字
    Node left;    // 左の子
    Node right;   // 右の子

    //ノードを作るとき
    Node(int value) {
        this.value = value;
        left = null;
        right = null;
    }
}

//二分探索木のクラス
public class BinarySearchTree {
    Node root; // 木の一番上

    public BinarySearchTree() {
        root = null;
    }

    //木に数字を入れる
    public void insert(int value) {
        root = insertRec(root, value);
    }

    //中で使うメソッド（再帰で入れる）
    private Node insertRec(Node root, int value) {
        //何もなければ、新しいノードを作って返す
        if (root == null) {
            root = new Node(value);
            return root;
        }

        //小さければ左へ
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        }
        //大きければ右へ
        else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }

        //元のノードをそのまま返す
        return root;
    }

    //数字を探す
    public boolean search(int value) {
        return searchRec(root, value);
    }

    //中で使うメソッド（再帰で探す）
    private boolean searchRec(Node root, int value) {
        //ノードがなければ false
        if (root == null) {
            return false;
        }

        //同じ数字があれば true
        if (root.value == value) {
            return true;
        }

        //小さければ左で探す
        if (value < root.value) {
            return searchRec(root.left, value);
        }

        //大きければ右で探す
        return searchRec(root.right, value);
    }

    //数字を木から消す
    public void delete(int value) {
        root = deleteRec(root, value);
    }

    //中で使うメソッド（再帰で消す）
    private Node deleteRec(Node root, int value) {
        if (root == null) {
            return root; //見つからなかった
        }

        //小さければ左をさがす
        if (value < root.value) {
            root.left = deleteRec(root.left, value);
        }
        //大きければ右をさがす
        else if (value > root.value) {
            root.right = deleteRec(root.right, value);
        }
        //見つかったら、消す処理をする
        else {
            //子がいないとき（葉ノード）
            if (root.left == null && root.right == null) {
                return null;
            }

            //子が1つ（左か右）
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            //子が2つあるとき
            //右の枝の中で一番小さい数字を見つける
            root.value = minValue(root.right);

            //その数字を右の枝から消す
            root.right = deleteRec(root.right, root.value);
        }

        return root;
    }

    //一番小さい数字を見つける
    private int minValue(Node root) {
        int minVal = root.value;
        while (root.left != null) {
            root = root.left;
            minVal = root.value;
        }
        return minVal;
    }

    //昇順で木の中を表示する（中順巡回）
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    //中順巡回のメソッド
    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.value + " ");
            inorderRec(root.right);
        }
    }

    //メインメソッド：この木の動きをテストする
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

        //数字を順番に出す（小さい順）
        System.out.print("数字を入れたあとの木: ");
        bst.inorder();  //小さい順に出るはず

        //数字をさがす
        System.out.println("40 はある？: " + bst.search(40)); //true
        System.out.println("90 はある？: " + bst.search(90)); //false

        //数字を木から消す
        bst.delete(20);  //子がいないノードを消す
        bst.delete(30);  //子が1つのノードを消す
        bst.delete(50);  //子が2つあるノードを消す

        //消したあとで、木を順番に出す
        System.out.print("数字を消したあとの木: ");
        bst.inorder();  //新しい木の状態が小さい順に出る

        //50 がまだあるか、もう一度たしかめる
        System.out.println("50 はまだある？: " + bst.search(50)); //false
    }
}