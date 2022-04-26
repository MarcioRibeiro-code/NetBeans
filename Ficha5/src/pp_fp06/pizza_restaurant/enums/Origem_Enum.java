/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package pp_fp06.pizza_restaurant.enums;

/**
 *
 * @author pc
 */
public enum Origem_Enum {
    animal, vegetal, mineral;

    public static String toString(Origem_Enum Enum) {

        switch (Enum) {
            case animal:
                return "Origem Animal";
            case vegetal:
                return "Origem Vegetal";
            default:
                return "Origem Mineral";
        }

    }

    public static String cod(Origem_Enum Enum) {

         switch (Enum) {
            case animal:
                return "AN";
            case vegetal:
                return "VG";
            default:
                return "MN";
        }
    }
}
