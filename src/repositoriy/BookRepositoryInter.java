package repositoriy;

import model.Book;
import utils.MyList;

public interface BookRepositoryInter {

    // Добавление книги
    Book addBook (String title, String author, int year, int id);
    // получить список всех книг
    MyList<Book> getAllBook();
    // получение книги по id
    Book getById(int id);
    // Получить список только свободных книг
    MyList<Book> getAvailableBooks();
    // Получить список только занятых книг
    MyList<Book> getBorrowedBooks();
    // Получение списка книг по названию
    MyList<Book> getBooksByTitle(String title);
    // Получение списка книг по автору
    MyList<Book> getBooksByAuthor(String author);
    // Выдать книгу
    Book borrowBook(int id);
    //Вернуть книгу
    boolean returnBook(int id);

    // Обновление даты бронирование книги
    void updateDate(int id, double newDate);
    //Дата возврата книги
    void updateReturnDate(int id, double newReturnDate);

    // Поменять статус наличие книги
    void updateBookStatus(int id, boolean newStatus);

    // Delete
    void deleteById(int id);
}


