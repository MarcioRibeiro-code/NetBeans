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
public class CD<T1, T2, T3, T4> extends Media<T1, T2, T3, T4> {

    private T4 Num_Faixas;
    //String pattern "%02d:%02d:%02d"
    private T1 tempo;

    public CD() {
        this.Num_Faixas = null;
        this.tempo = null;
    }

    public CD(T1 title, T2 price, T3 language, T3 genre, T4 quantity, T4 Num_Faixas, T1 tempo) {
        super(title, price, language, genre, quantity);
        this.Num_Faixas = Num_Faixas;

        if (Pattern.matches("^(?:(?:([01]?\\d|2[0-3]):)?([0-5]?\\d):)?([0-5]?\\d)$", (String) tempo)) {
            this.tempo = tempo;
        }else{
        this.tempo=(T1)"00:00:00";
        }
    }

    @Override
    public String toString() {
        return "\nCD" + "\nNum_Faixas=" + Num_Faixas + "\ntempo=" + tempo +  super.toString();
    }

}
