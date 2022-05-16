/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp07.bike;

import java.util.Arrays;
import pp_fp07.bike.ENUMS.ENUM_BIKETOOLS;
import pp_fp07.bike.ENUMS.ENUM_SUSPENSION_TYPE;

/**
 *
 * @author PC
 */
public class MountainBike extends Bike {

    private int numberOfLights;
    private ENUM_SUSPENSION_TYPE suspension;
    private int contador_bikeTools = 0;
    private ENUM_BIKETOOLS bikeTools[] = new ENUM_BIKETOOLS[5];

    public MountainBike(int numberOfLights, String suspension,
            int numberOfGears, String mainColor, double wheelSize, String brakes,
            String material, double price, int guarantee) {
        super(numberOfGears, mainColor, wheelSize, brakes, material, price, guarantee);
        this.numberOfLights = numberOfLights;
        this.suspension = ENUM_SUSPENSION_TYPE.String_toEnum(suspension);
    }

    public int add_BikeTools(String bikeTools) {

        if (contador_bikeTools < 5) {

            ENUM_BIKETOOLS temp = ENUM_BIKETOOLS.String_toEnum(bikeTools);

            for (int i = 0; i < contador_bikeTools; i++) {
                if (this.bikeTools[i] == temp) {
                    return -1;
                }
            }

            if (temp != null) {
                this.bikeTools[contador_bikeTools++] = temp;
                return 1;
            }

        }
        return -1;
    }

    @Override
    public String toString() {

        return "--MountainBike--" + super.toString() + "\nNumberOfLights=" + numberOfLights + "\nSuspension Type=" + suspension
                + "\nBike Tools=" + Arrays.toString(bikeTools)+"\n";
    }
}
