/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;

import java.util.Objects;
import java.util.UUID;

/**
 *
 * @author PC
 */
public class Media<T1, T2, T3, T4> {

    private UUID uuid;
    //T1 - String
    private T1 title;
    //T2 - float
    private T2 price;
    //T3 - enum
    private T3 language;
    private T3 genre;
    //T4 - int
    private T4 quantity;

    public Media() {
        uuid = null;
        title = null;
        price = null;
        language = null;
        genre = null;
        quantity = null;
    }

    public Media(T1 title, T2 price, T3 language, T3 genre, T4 quantity) {
        this.uuid = UUID.randomUUID();
        this.title = title;
        this.price = price;

        this.language = language;
        this.genre = genre;
        this.quantity = quantity;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public T1 getTitle() {
        return title;
    }

    public void setTitle(T1 title) {
        this.title = title;
    }

    public T2 getPrice() {
        return price;
    }

    public void setPrice(T2 price) {
        this.price = price;
    }

    public T3 getLanguage() {
        return language;
    }

    public void setLanguage(T3 language) {
        this.language = language;
    }

    public T3 getGenre() {
        return genre;
    }

    public void setGenre(T3 genre) {
        this.genre = genre;
    }

    public T4 getQuantity() {
        return quantity;
    }

    /*
    public T4 nextValue() {
        T4 answer = this.getQuantity();
        advance();
        return answer;
    }

    private void advance() {
        this.getQuantity().advance();
    }*/

    public void setQuantity(T4 value) {
      // System.out.println("Antes"+ this.quantity);
      // System.out.println("Depois"+value); 
        this.quantity=value;
        
    }

    @Override
    public String toString() {
        return "\nuuid=" + uuid + "\ntitle=" + title + "\nprice="
                + price + "\nlanguage=" + language + "\ngenre=" + genre + "\nquantity=" + quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Media<?, ?, ?, ?> other = (Media<?, ?, ?, ?>) obj;
        return Objects.equals(this.uuid, other.uuid);
    }

}
