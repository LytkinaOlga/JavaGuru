package by.bntu.fitr.poisit.lytkina;

public interface LibraryI {
    void addBookInLib(Book book);
    void deleteBookFromLib(Book book);
    Book findBookByBookName(String bookName);
    Book returnBookByAuthorName(String authorName);

}
