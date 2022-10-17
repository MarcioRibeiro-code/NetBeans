/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp07;

import pp_fp07.BicycleManagement.BicicyleManagement;
import pp_fp07.bike.MountainBike;
import pp_fp07.bike.RoadBike;

/**
 *
 * @author PC
 */
public class Pp_fp07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
        RoadBike rb1 = new RoadBike("red", "XX_SMALL", "Bicicleta com defeito de frabrica, frame com a cor picada", 21, "azul", 26, "pincas", "carbono", 402.4, 10);

        MountainBike mb1 = new MountainBike(1, "Simples", 21, "azul", 26, "pincas", "carbono", 402.4, 10);
        MountainBike mb2 = new MountainBike(1, "Simples", 21, "azul", 26, "pincas", "carbono", 402.4, 10);

        mb1.add_BikeTools("Garrafa de agua");

        System.out.println(rb1.toString());

        System.out.println(mb1.toString());
        System.out.println(mb2.toString());
         */
        BicicyleManagement store = new BicicyleManagement();
       
        store.add_mountainBike(1, "Simples", 21, "azul", 26, "pincas", "carbono", 402.4, 10);
        store.add_mountainBike(1, "Simples", 21, "azul", 26, "pincas", "carbono", 402.4, 10);

        store.add_RoadBike("red", "XX_SMALL", "Bicicleta com defeito de frabrica, frame com a cor picada", 21, "azul", 26, "pincas", "carbono", 402.4, 10);
        
        
        store.add_bikeTools("mb0", "Garrafa de Agua");
        store.remove_bike("mb1");
        System.out.println(store.toString());
        // System.out.println(store.list_MountainBikes());
    }

}
