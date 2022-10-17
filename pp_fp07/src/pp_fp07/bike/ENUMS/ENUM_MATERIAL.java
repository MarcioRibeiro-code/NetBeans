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
public enum ENUM_MATERIAL {
    carbono, aluminio;

    public static ENUM_MATERIAL String_toEnum(String Material) {
 
        switch (Material.toUpperCase()) {
            case "CARBONO": return carbono;
            default : return aluminio;
        }

       
    }
}
