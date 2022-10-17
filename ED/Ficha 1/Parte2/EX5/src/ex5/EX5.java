/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5;

import java.util.ArrayList;
import java.util.List;
import lib.Book;
import lib.CD;
import lib.DVD;
import lib.Enum.Book_Genre;
import lib.Enum.Language;
import lib.Enum.Movie_Genre;
import lib.Enum.Music_Genre;
import lib.Media;
import lib.Store;

/**
 *
 * @author PC
 */
public class EX5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Store store = new Store();
        Book b1 = new Book<String, Float, Enum, Integer>("Titulo do Livro", 10F, Language.EN, Book_Genre.Horror, 1, "ISBN", 1);
        CD c1 = new CD<String, Float, Enum, Integer>("Titulo do CD", 10F, Language.EN, Music_Genre.Pop, 1, 3, "10:12:30");
        DVD d1 = new DVD<String, Float, Enum, Integer>("Titulo do DVD", 10F, Language.EN, Movie_Genre.Action, 1,"10:12:30");
        store.add(b1);
        store.add(b1);
        store.add(c1);
        store.add(d1);

        System.out.println(store.toString());

        store.remove();
        System.out.println(store.toString());

        /*
        List<Media> ls = new ArrayList<>();
        
        ls.add(new CD<String,Float,Enum,Integer>("Titulo do CD",10F,Language.EN,Music_Genre.Pop,1,3,"10:12:30"));
        
        System.out.println(ls.toString());
         */
    }

}
