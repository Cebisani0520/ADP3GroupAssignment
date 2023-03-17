/** BookFactory.java
 * This is a Factory class
 * This class sets the factory functionality of the program
 * Cebisani Lamani (219104409)
 * 11 March 2023 */
package za.ca.cput.factory;

import za.ca.cput.domain.Book;
import za.ca.cput.util.BookHelper;

public class BookFactory {
    public static Book addBook(String bookName, String authorName, String authorSurname, String bookCategory, double bookPrice) {

        String isbnNumber = BookHelper.generateISBN().toString();

        if (BookHelper.isNullOrEmpty(bookName) || BookHelper.isNullOrEmpty(authorName) || BookHelper.isNullOrEmpty(authorName) || BookHelper.isNullOrEmpty(bookCategory)){
            return null;
        }
        if (BookHelper.isLessThanZero(bookPrice)){
            return null;
        }
        return new Book.Builder().setIsbnNum(isbnNumber)
                .setBookName(bookName)
                .setAuthorName(authorName)
                .setAuthorSurname(authorSurname)
                .setCategory(bookCategory)
                .setBookPrice(bookPrice)
                .build();
    }
    public static Book addAuthor(String authorName, String authorSurname, String authorEmail){
        if(BookHelper.isNullOrEmpty(authorName) || BookHelper.isNullOrEmpty(authorSurname)){
            return null;
        }
        if(!BookHelper.isEmailValid(authorEmail)){
            return null;
        }
        return new Book.Builder().setAuthorName(authorName)
                .setAuthorSurname(authorSurname)
                .setAuthorEmail(authorEmail)
                .build();
    }
}
