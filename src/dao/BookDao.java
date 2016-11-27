package dao;


import domain.Book;

import java.util.List;

public interface BookDao {

    public void addBook(Book book);
    public void removeBook(Book book);
    List<Book>getAll();
}
