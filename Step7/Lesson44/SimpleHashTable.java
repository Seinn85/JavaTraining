public class SimpleHashTable {
    //キーと値を入れるクラス
    static class Entry {
        int key;           //キー（数字）
        String value;      //値（文字）
        boolean isDeleted; //消したかどうか（trueなら削除された）

        Entry(int key, String value) {
            this.key = key;
            this.value = value;
            this.isDeleted = false; //最初は削除されていない
        }
    }

    private Entry[] table; //データを入れる配列
    private int size;      //配列の大きさ

    public SimpleHashTable(int size) {
        this.size = size;
        this.table = new Entry[size]; //配列を作る
    }

    //ハッシュ関数（キーから場所を決める）
    private int hash(int key) {
        return key % size;
    }

    //データを入れる（追加・更新）
    public void put(int key, String value) {
        int index = hash(key);
        for (int i = 0; i < size; i++) {
            int tryIndex = (index + i) % size;
            Entry entry = table[tryIndex];

            //空いている、または削除された場所、または同じキーがあるとき
            if (entry == null || entry.isDeleted || entry.key == key) {
                table[tryIndex] = new Entry(key, value);
                System.out.println("（" + key + ", " + value + "）を " + tryIndex + " に入れました");
                return;
            }
        }
        System.out.println("いっぱいで入れられません");
    }

    //データを取り出す（検索）
    public String get(int key) {
        int index = hash(key);
        for (int i = 0; i < size; i++) {
            int tryIndex = (index + i) % size;
            Entry entry = table[tryIndex];

            //データがないとき
            if (entry == null) return null;

            //削除されていなくて、キーが同じなら値を返す
            if (!entry.isDeleted && entry.key == key) {
                return entry.value;
            }
        }
        return null; //見つからなかったとき
    }

    //データを削除する
    public void remove(int key) {
        int index = hash(key);
        for (int i = 0; i < size; i++) {
            int tryIndex = (index + i) % size;
            Entry entry = table[tryIndex];

            //データがないとき
            if (entry == null) return;

            //削除されていなくて、キーが同じなら削除マークをつける
            if (!entry.isDeleted && entry.key == key) {
                entry.isDeleted = true;
                System.out.println("キー " + key + " を " + tryIndex + " から消しました");
                return;
            }
        }
    }

    //ハッシュテーブルの中身を見る
    public void display() {
        System.out.println("ハッシュテーブルの中身：");
        for (int i = 0; i < size; i++) {
            Entry entry = table[i];
            if (entry != null && !entry.isDeleted) {
                System.out.println("インデックス " + i + ": (" + entry.key + ", " + entry.value + ")");
            } else {
                System.out.println("インデックス " + i + ": 空");
            }
        }
    }

    //テスト用プログラム
    public static void main(String[] args) {
        SimpleHashTable hashTable = new SimpleHashTable(10);

        //データを入れる
        hashTable.put(1, "Apple");
        hashTable.put(11, "Banana"); //1と同じ場所になる（ぶつかる）
        hashTable.put(21, "Cherry"); //またぶつかる

        //テーブルを表示
        hashTable.display();

        //データを探す
        System.out.println("キー11の値： " + hashTable.get(11));

        //データを消す
        hashTable.remove(11);

        //もう一度表示
        hashTable.display();

        //消したあとの値を取り出す
        System.out.println("消した後のキー11の値： " + hashTable.get(11));
    }
}