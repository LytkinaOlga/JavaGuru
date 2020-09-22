package by.bntu.fitr.poisit.lytkina;

import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryI{
    List<Book> bookList = new ArrayList<>();

    @Override
    public void addBookInLib(Book book) {
        bookList.add(book);
    }

    @Override
    public void deleteBookFromLib(Book book) {
        bookList.remove(book);
    }

    @Override
    public Book findBookByBookName(String bookName) {
        Book result = null;
        for (Book book: bookList) {
            if(book.getBookName().equals(bookName)){
                result = book;
            }
        }
        return result;
    }

    @Override
    public Book returnBookByAuthorName(String authorName) {
        Book result = null;
        for (Book book: bookList) {
            if(book.getAuthorName().equals(authorName)){
                result = book;
            }
        }
        return result;
    }

    public void printLibrary(){
        for (Book book: bookList ) {
            App.log.info("{}", book);
        }
    }
    public int returnSizeOfLibrary(){
        return bookList.size();
    }
}
