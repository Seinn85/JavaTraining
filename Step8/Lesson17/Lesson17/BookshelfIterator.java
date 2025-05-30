//
package Lesson17;

//Bookshelf の本を順番に取り出すための イテレータクラス を作成します。
public class BookshelfIterator implements Iterator {
    private Bookshelf bookshelf;
    private int index = 0;

    public BookshelfIterator(Bookshelf bookshelf) {
        this.bookshelf = bookshelf;
    }

    @Override
    public boolean hasNext() {
        return index < bookshelf.getSize();
    }

    @Override
    public Book next() {
        return bookshelf.getBookAt(index++);
    }
}