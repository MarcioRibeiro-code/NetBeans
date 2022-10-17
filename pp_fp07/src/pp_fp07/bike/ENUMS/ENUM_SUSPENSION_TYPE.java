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
public enum ENUM_SUSPENSION_TYPE {
    simples,dupla,sem_suspensao;
    
      public static ENUM_SUSPENSION_TYPE String_toEnum(String Suspension_Type) {
 
        switch (Suspension_Type.toUpperCase()) {
            
            case "SIMPLES": return simples;
            case "DUPLA": return dupla;
            
            default : return sem_suspensao;
        }

       
    }
    
}
