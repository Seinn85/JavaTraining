package Lesson17;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf implements IterableCollection {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public int getSize() {
        return books.size();
    }

    @Override
    public Iterator createIterator() {
        return new BookshelfIterator(this);
    }
}