/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp07.bike.ENUMS;

/**
 *
 * @author PC
 */
public enum ENUM_BIKESIZE {
    XX_Small, X_Small, Small, Medium, Large, X_Large, XX_Large;
    
      public static ENUM_BIKESIZE String_toEnum(String BikeSize) {
 
        switch (BikeSize.toUpperCase()) {
            case "XX_SMALL": return XX_Small;
            
            case "X_SMALL": return X_Small;
            
            case "SMALL": return Small;
            case "LARGE": return Large;
            case "X_LARGE": return X_Large;
            case "XX_LARGE": return XX_Large;
            
            default : return Medium;
        }

       
    }
    
}
