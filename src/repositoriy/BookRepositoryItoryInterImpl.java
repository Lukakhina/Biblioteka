package repositoriy;

import model.Book;
import utils.MyArrayList;
import utils.MyList;

import java.util.concurrent.atomic.AtomicInteger;

public class BookRepositoryItoryInterImpl implements BookRepositoryInter {
    // Все книги которые находятся в библиотеке
    private final MyList<Book> books ;

    // Объект, отвечающий за генерацию уникальных id
    private final AtomicInteger currentId = new AtomicInteger(1);


    public BookRepositoryItoryInterImpl() {
       this.books = new MyArrayList<>();
      // addStartBooks();
    }

    // Объект, отвечающий за генерацию уникальных id
   // private final AtomicInteger currentId = new AtomicInteger(1);







    @Override
    public Book addBook(String title, String author, int year, int id) {
        return null;
    }

    @Override
    public MyList<Book> getAllBook() {
        return null;
    }

    @Override
    public Book getById(int id) {
        return null;
    }

    @Override
    public MyList<Book> getAvailableBooks() {
        return null;
    }

    @Override
    public MyList<Book> getBorrowedBooks() {
        return null;
    }

    @Override
    public MyList<Book> getBooksByTitle(String title) {
        return null;
    }

    @Override
    public MyList<Book> getBooksByAuthor(String author) {
        return null;
    }

    @Override
    public Book borrowBook(int id) {
        return null;
    }

    @Override
    public boolean returnBook(int id) {
        return false;
    }

    @Override
    public void updateDate(int id, double newDate) {

    }

    @Override
    public void updateReturnDate(int id, double newReturnDate) {

    }

    @Override
    public void updateBookStatus(int id, boolean newStatus) {

    }

    @Override
    public void deleteById(int id) {

    }
}
