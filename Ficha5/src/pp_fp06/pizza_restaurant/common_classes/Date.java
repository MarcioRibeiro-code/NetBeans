/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp06.pizza_restaurant.common_classes;

/**
 *
 * @author pc
 */
public class Date {
   protected final String Dia;
   protected final String Mes;
   protected final String Ano;

    public Date(String Dia, String Mes, String Ano) {
        this.Dia = Dia;
        this.Mes = Mes;
        this.Ano = Ano;
    }



    
    public static String toString(Date date) {
        return date.Dia + "/" + date.Mes + "/" + date.Mes;
    }
   
   
   
}
