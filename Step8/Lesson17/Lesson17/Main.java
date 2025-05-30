//イテレーターパターンを使った「本棚の管理システム」
package Lesson17;

//本棚に本を追加し、イテレータを使って順番に本を取得 するクライアントコードを作成します。
public class Main {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();

        // 本を追加
        bookshelf.addBook(new Book("The Catcher in the Rye"));
        bookshelf.addBook(new Book("To Kill a Mockingbird"));
        bookshelf.addBook(new Book("1984"));
        bookshelf.addBook(new Book("Moby Dick"));

        // イテレータを作成
        Iterator iterator = bookshelf.createIterator();

        // 本を順番に取得
        while (iterator.hasNext()) {
            System.out.println("Book: " + iterator.next().getTitle());
        }
    }
}