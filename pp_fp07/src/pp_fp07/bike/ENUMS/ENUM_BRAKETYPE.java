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
public enum ENUM_BRAKETYPE {
    pincas, hidraulicos;
    
    
    
      public static ENUM_BRAKETYPE String_toEnum(String BrakeType) {
 
        switch (BrakeType.toUpperCase()) {
            case "HIDRAULICOS": return hidraulicos;
            default : return pincas;
        }

       
    }
}
