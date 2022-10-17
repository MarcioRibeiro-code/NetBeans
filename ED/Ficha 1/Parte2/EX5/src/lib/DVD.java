/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;

import java.util.regex.Pattern;

/**
 *
 * @author PC
 */
public class DVD<T1, T2, T3, T4> extends Media<T1, T2, T3, T4> {

    private T1 tempo;

    public DVD() {
        this.tempo = null;
    }

    public DVD(T1 title, T2 price, T3 language, T3 genre, T4 quantity, T1 tempo) {
        super(title, price, language, genre, quantity);

        if (Pattern.matches("^(?:(?:([01]?\\d|2[0-3]):)?([0-5]?\\d):)?([0-5]?\\d)$", (String) tempo)) {
            this.tempo = tempo;
        } else {
            this.tempo = (T1) "00:00:00";
        }
    }

    @Override
    public String toString() {
        return "\nDVD" + "\ntempo=" + tempo + super.toString();
    }

}
