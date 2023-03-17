package za.ca.cput.factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ca.cput.domain.Book;
import java.util.*;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

class BookFactoryTest {
    public List<Book> bookList = null;
    public Set<Book> bookSet = null;

    @Test
    public void objEqualityTest(){
        Book author1 = BookFactory.addAuthor("Cebisani", "Lamani", "219104409@mycput.ac.za");
        Book author2 = BookFactory.addAuthor("Cebisani", "Lamani", "219104409@mycput.ac.za");
        System.out.println(author1.toString() + author2.toString());
        assertEquals(author1, author2);
    }
    @Test
    public void objIdentityTest(){
        bookSet = new HashSet<>();
            Book book1 = BookFactory.addBook("YOU", "Sammy", "Adam", "Thriller", 200.00);
            Book book2 = BookFactory.addBook("YOU", "Sammy", "Adam", "Thriller", 200.00);
            bookSet.add(book1);
            bookSet.add(book2);
            System.out.println(book1.toString() + book2.toString());
        assertNotEquals(book1, book2);
    }

    @Test
    public void failingTest(){
        bookList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Book book = BookFactory.addBook("A Time To Kill", "John", "Grisham", "Mystery", 350.00);
            bookList.add(book);
            System.out.println(book.toString());
        }
        assertEquals(1, bookList.size());
    }

    @Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    public void timeoutTest() throws InterruptedException{
        for (int i = 0; i < 150; i++) {
            Book book = BookFactory.addBook("A Time To Kill", "John", "Grisham", "Mystery", 350.00);
            System.out.println(book.toString());
        }
        Thread.sleep(2000);
    }

    @Test
    @Disabled
    public void disablingTest(){
        Book author3 = BookFactory.addAuthor("Cebisani", "Lamani", "cebisani@gmail.com");
        System.out.println(author3.toString());

    }

}