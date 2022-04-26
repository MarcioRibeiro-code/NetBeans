
import java.util.Arrays;
import pp_fp06.pizza_restaurant.Ementa;
import pp_fp06.pizza_restaurant.Ementas;
import pp_fp06.pizza_restaurant.Ingrediente;
import pp_fp06.pizza_restaurant.Pizza;
import pp_fp06.pizza_restaurant.common_classes.Date;
import pp_fp06.pizza_restaurant.enums.Origem_Enum;
import pp_fp06.pizza_restaurant.enums.Tamanho_Enum;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author pc
 */
public class Pizzaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  Date Inicio = new Date("1", "1", "1111");
        //Ementa = new Ementa("Ementa Pizza 1","Pizza vegetaria",cod_ID,Inicio);
        Ementa em1 = new Ementa("Ementa Pizza 1", "Pizza vegetarianas", Inicio);

        Pizza pz1 = new Pizza("1", "4 queijos", "1 queijo,2 queijo,3 queijo,4 queijo", 8.7, Tamanho_Enum.Media);
        em1.setPizza(pz1);
        //em1.setPizza(pz1);

        Ingrediente ing1 = new Ingrediente("Queijo", Origem_Enum.animal, 10);

        Ingrediente ing2 = new Ingrediente("Queijo", Origem_Enum.animal, 10);
        Ingrediente ing3 = new Ingrediente("Queijo", Origem_Enum.animal, 10);
        em1.setIngrediente("1", ing1);
        em1.setIngrediente("1", ing2);
        em1.setIngrediente("1", ing3);
        pz1.remove_ingredient("AN0");
        // em1.Search_Ingredient_VID("AN1");

        // System.out.println(Arrays.toString(pz1.getIngredientes()));
        System.out.println(em1.toString());
        System.out.println(em1.Calc_CalPizza("1"));*/

        Date Inicio = new Date("1", "1", "1111");
        //Ementa = new Ementa("Ementa Pizza 1","Pizza vegetaria",cod_ID,Inicio);
        //Ementa em1 = new Ementa("Ementa Pizza 1", "Pizza vegetarianas", Inicio);

        Ementas ems = new Ementas();

        ems.addEmenta("Ementa Pizza 1", "Pizza vegetarianas", Inicio);
        ems.addEmenta("Ementa Pizza 1", "Pizza vegetarianas", Inicio);

        System.out.println(Ementas.getContador());
        ems.setEmenta_Ativa("EM0");
        System.out.println(ems.toString());
        
        System.out.println(ems.toString());
    }

}
