/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;

import lib.Enum.Book_Genre;
import lib.Enum.Language;

/**
 *
 * @author PC
 */
public class Book<T1, T2, T3, T4> extends Media<T1, T2, T3, T4> {

    private T1 ISBN;
    private T4 edition;

    public Book() {
        this.ISBN = null;
        this.edition = null;
    }

    public Book(T1 title, T2 price, T3 language, T3 genre, T4 quantity, T1 ISBN, T4 edition) {
        super(title, price, language, genre, quantity);
        this.ISBN = ISBN;
        this.edition = edition;
    }

    public Book(T1 title, T2 price, T3 language, T3 genre, T4 quantity) {
        super(title, price, language, genre, quantity);
    }

    @Override
    public String toString() {
        return "\nBook" + "\nISBN=" + ISBN + "\nedition=" + edition  + super.toString();
    }

}
