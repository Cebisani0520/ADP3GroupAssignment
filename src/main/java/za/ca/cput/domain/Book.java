/*
Book POJO Class
Haydn Abrahams - 221225226
 */

package za.ca.cput.domain;

public class Book {
    private String isbnNo;
    private String bookAuthor;
    private String bookName;

    public Book() {
    }

    public Book(String isbnNo, String bookAuthor, String bookName) {
        this.isbnNo = isbnNo;
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
    }

    public String getIsbnNo() {
        return isbnNo;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbnNo='" + isbnNo + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
