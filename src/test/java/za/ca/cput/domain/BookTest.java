/*
BookTest Class that tests Object Equality, Object Identity, Failing Tests, Timeouts and Disabling Tests
Haydn Abrahams - 221225226
 */
package za.ca.cput.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    public void objectEqualityTest() {
        List<Book> bookList= new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Book b = new Book("GF5001","Glen Fadrouw","What it all means");
            bookList.add(b);
        }
        assertEquals(10, bookList.size());
    }
    @Test
    public void objectIdentityTest() {
        Book book = new Book("BP1090", "Busta Posey","Method Man");
        Book book1 = book;
        Book book2 = new Book("JF9032","Jean Francis","How to get away with murder");

        assertSame(book, book1);
        assertNotSame(book, book2);
    }
    @Test
    public void failTest() {
       Book book1 = new Book("DO7211", "Dustin Olivero", "Psychological Warfare explained");
       Book book2 = new Book("MM8-088","Mark Manson","The Subtle Art of not giving a fuck");
       assertEquals(book1, book2);
    }

    @Test
    public void timeoutTest() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);
    }
    @Test
    public void disablingTest() {
        Book book1 = new Book();
        assertNotNull(book1);
    }
}