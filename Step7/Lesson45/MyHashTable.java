public class MyHashTable<K, V> {

    //キーと値を入れるノードのクラス
    private static class Entry<K, V> {
        K key;       //キー
        V value;     //値
        Entry<K, V> next; //次のノード（リスト用）

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Entry<K, V>[] buckets; //ノードを入れる配列
    private int size; //配列の大きさ

    @SuppressWarnings("unchecked")
    public MyHashTable(int size) {
        this.size = size;
        this.buckets = new Entry[size]; //配列を作る
    }

    //ハッシュ関数（マイナスの数も対応）
    private int getIndex(K key) {
        return Math.abs(key.hashCode() % size);
    }

    //値を追加する。または、同じキーがあれば更新する
    public void put(K key, V value) {
        int index = getIndex(key);
        Entry<K, V> current = buckets[index];

        //同じキーがあるとき、値を更新する
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        //同じキーがないとき、新しいノードを前に入れる
        Entry<K, V> newEntry = new Entry<>(key, value);
        newEntry.next = buckets[index];
        buckets[index] = newEntry;
    }

    //値を取り出す。なければ null を返す
    public V get(K key) {
        int index = getIndex(key);
        Entry<K, V> current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        return null; //見つからないとき
    }

    //値を削除する（あるときだけ）
    public void remove(K key) {
        int index = getIndex(key);
        Entry<K, V> current = buckets[index];
        Entry<K, V> prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = current.next; //最初のノードを消す
                } else {
                    prev.next = current.next; //真ん中や最後のノードを消す
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    //テスト用
    public static void main(String[] args) {
        MyHashTable<String, Integer> table = new MyHashTable<>(10);
        table.put("Apple", 100);
        table.put("Banana", 200);
        table.put("Orange", 300);
        table.put("Grape", 400);

        System.out.println("Banana = " + table.get("Banana")); // -> 200

        table.put("Apple", 150); // 値を更新する
        System.out.println("Apple = " + table.get("Apple")); // -> 150

        table.remove("Orange"); // 値を削除する
        System.out.println("Orange = " + table.get("Orange")); // -> null
    }
}