/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp07.BicycleManagement;

//import java.util.Arrays;
import pp_fp07.bike.Bike;
import pp_fp07.bike.MountainBike;
import pp_fp07.bike.RoadBike;

/**
 *
 * @author PC
 */
public class BicicyleManagement {

    private Bike bike[] = new Bike[30];
    private static int contador = 0;

    public void add_mountainBike(int numberOfLights, String suspension,
            int numberOfGears, String mainColor, double wheelSize, String brakes,
            String material, double price, int guarantee) {

        if (BicicyleManagement.contador < 30) {
            bike[contador++] = (Bike) new MountainBike(numberOfLights, suspension, numberOfGears, mainColor, wheelSize, brakes, material, price, guarantee);
        } else {
            System.out.println("MAX SIZE");
        }

    }

    public void add_bikeTools(String ID, String BikeTool) {

        var temp = search_byID(ID);

        if (temp instanceof MountainBike) {
            MountainBike mb_temp = (MountainBike) temp;
            if (mb_temp.add_BikeTools(BikeTool) == 1) {

                for (int i = 0; i < BicicyleManagement.contador; i++) {
                    if (this.bike[i].equals(temp)) {
                        temp = (Bike) mb_temp;
                    }

                }
                System.out.println("Adicionado Com Sucesso");
            } else {
                System.out.println("Nao foi possivel Adicionar");
            }

        } else {

            System.out.println(ID + " NOT INSTANCEOF MOUNTAINBIKE");
        }

    }

    public void add_RoadBike(String handlebelt, String frameSize, String observations,
            int numberOfGears, String mainColor, double wheelSize,
            String brakes, String material, double price,
            int guarantee) {

        if (BicicyleManagement.contador < 30) {
            bike[contador++] = (Bike) new RoadBike(handlebelt, frameSize, observations, numberOfGears, mainColor, wheelSize, brakes, material, price, guarantee);
        } else {
            System.out.println("MAX SIZE");
        }
    }

    private Bike search_byID(String ID) {

        //System.out.println(ID);
        for (int i = 0; i < BicicyleManagement.contador; i++) {
            // System.out.println(this.bike[i].getId());
            if (this.bike[i].getId().equals(ID.toUpperCase())) {

                return this.bike[i];
            }
            /* if (this.bike[i] instanceof MountainBike) {
                MountainBike temp = (MountainBike) this.bike[i];
            } else {
                RoadBike temp = (RoadBike) this.bike[i];
            } 
             */ {

            }
        }
        return null;
    }

    public String list_MountainBikes() {

        String ret = "";

        for (int i = 0; i < BicicyleManagement.contador; i++) {
            if (this.bike[i] instanceof MountainBike) {
                ret += this.bike[i].toString();
            }
        }

        return ret;
    }

    public int remove_bike(String ID) {

        int pos = -1;

        Bike[] new_array = new Bike[this.bike.length];

        for (int i = 0; i < contador; i++) {
            if (search_byID(ID) == this.bike[i]) {
                pos = i;
                //temp_ing[i] = null;
                //this.setNum_Ingredientes('-');
            }
        }

        if (pos != -1) {
            for (int i = 0, k = 0; i <= contador; i++) {

                if (pos != i) {
                    // System.out.println("k" + k);
                    new_array[k++] = this.bike[i];

                } else {
                    contador--;
                }

            }

            //System.out.println(Arrays.toString(new_array));
            this.bike = new_array;

            return 1;
        }

        //System.out.println(Arrays.toString(new_array));
        return -1;
    }

    @Override
    public String toString() {

        String temp = "BicicyleManagement\n";

        for (int i = 0; i < BicicyleManagement.contador; i++) {
            temp += bike[i].toString();
        }

        return temp;
    }

}
