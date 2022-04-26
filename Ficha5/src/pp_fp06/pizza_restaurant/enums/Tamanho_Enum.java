/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package pp_fp06.pizza_restaurant.enums;

/**
 *
 * @author pc
 */
public enum Tamanho_Enum {
    Pequena, Media, Familiar;

    public static String toString(Tamanho_Enum Enum) {
        switch (Enum) {
            case Pequena: return "Tamanho - Pizza Pequena"; 
            case Media: return "Tamanho - Pizza Media"; 
            default: return "Tamanho - Pizza Familiar"; 
        }
    }
}
