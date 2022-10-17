/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp07.bike;

import pp_fp07.bike.ENUMS.ENUM_BIKESIZE;

/**
 *
 * @author PC
 */
public class RoadBike extends Bike {

    private String handlebelt = "";
    private final ENUM_BIKESIZE frameSize;
    private String observations = "";

    public RoadBike(String handlebelt, String frameSize, String observations,
            int numberOfGears, String mainColor, double wheelSize,
            String brakes, String material, double price,
            int guarantee) {

        super(numberOfGears, mainColor, wheelSize, brakes, material, price, guarantee);
        this.handlebelt = handlebelt;
        this.frameSize = ENUM_BIKESIZE.String_toEnum(frameSize);

        if (observations.length() <= 50) {
            this.observations = observations;
        } else {

            char[] obsArray = observations.toCharArray();

            for (int i = 0; i < 50; i++) {
                this.observations += obsArray[i];
            }
            this.observations += " (...)";
        }

    }

    @Override
    public String toString() {

        return "--RoadBike--" + super.toString() + "\nHandlebelt=" + handlebelt + "\nframeSize=" + frameSize
                + "\nObservations=" + observations;
    }

}
