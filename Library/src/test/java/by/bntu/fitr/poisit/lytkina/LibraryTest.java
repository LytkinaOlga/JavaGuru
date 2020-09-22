package by.bntu.fitr.poisit.lytkina;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryTest {
    Book firstBook;
    Book secondBook;
    Book thirdBook;
    Library library;

    @Before
    public void init(){
        firstBook = new Book("Make Omer", "Inside killer");
        secondBook = new Book("Joanne Rowlong", "Harry Potter");
        thirdBook = new Book("Stephanie Mayer", "Twilight");
        library = new Library();

        library.addBookInLib(firstBook);
        library.addBookInLib(secondBook);
        library.addBookInLib(thirdBook);
    }


    @Test
    public void addBookInLib() {

        assertEquals(3, library.returnSizeOfLibrary());
    }

    @Test
    public void deleteBookFromLib() {

        library.deleteBookFromLib(firstBook);
        assertEquals(2, library.returnSizeOfLibrary());
    }

    @Test
    public void findBookByName() {
        Book expectedBook = new Book("Make Omer", "Inside killer");
        Book actualBook = library.findBookByBookName("Inside killer");
        assertEquals(expectedBook, actualBook);

    }

    @Test
    public void returnBookByAuthorName() {
        Book expectedBook = new Book("Make Omer", "Inside killer");
        Book actualBook = library.returnBookByAuthorName("Make Omer");
        assertEquals(expectedBook, actualBook);
    }

    @Test
    public void returnSizeOfLibrary() {
        assertEquals(3, library.returnSizeOfLibrary());
    }
}