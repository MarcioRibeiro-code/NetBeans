/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp07.bike;

import pp_fp07.bike.ENUMS.ENUM_BRAKETYPE;
import pp_fp07.bike.ENUMS.ENUM_MATERIAL;

/**
 *
 * @author PC
 */
public abstract class Bike {

    protected static int CONTADOR = 0;
    private final String id;
    private final int numberOfGears;
    private final String mainColor;
    private final double wheelSize;
    private final ENUM_BRAKETYPE brakes;
    private final ENUM_MATERIAL material;
    private final double price;
    private final int guarantee;

    public Bike(int numberOfGears, String mainColor, double wheelSize, String brakes, String material, double price, int guarantee) {

        if (this instanceof RoadBike) {
            this.id = "RB" + Bike.CONTADOR++;
        } else {
            this.id = "MB" + Bike.CONTADOR++;
        }

        this.numberOfGears = numberOfGears;
        this.mainColor = mainColor;
        this.wheelSize = wheelSize;
        this.brakes = ENUM_BRAKETYPE.String_toEnum(brakes);
        this.material = ENUM_MATERIAL.String_toEnum(material);
        this.price = price;
        this.guarantee = guarantee;
    }

    public String getId() {
        return id;
    }

    
    
    
    
    @Override
    public String toString() {
        return "\nId=" + id + "\nNumberOfGears=" + numberOfGears + "\nMainColor=" + mainColor + "\nWheelSize=" + wheelSize + "\nBrakes=" + brakes + "\nMaterial=" + material + "\nPrice=" + price + "\nGuarantee=" + guarantee;
    }

}
