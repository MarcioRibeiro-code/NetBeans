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
public enum ENUM_BIKETOOLS {
    garrafa_agua, kit_reparacao_pneu, conta_quilometros, alforge, suporte_tlm;
    
    
         public static ENUM_BIKETOOLS String_toEnum(String BikeTool) {
 
        switch (BikeTool.toUpperCase()) {
            case "GARRAFA DE AGUA": return garrafa_agua;
            case "KIT REPARACAO PNEU": return kit_reparacao_pneu; 
            case "CONTA-QUILOMETROS": return conta_quilometros;
            case "Alforge": return alforge;
            case "Suporte para telemovel": return suporte_tlm;
            
            
            default : return null;
        }

       
    }
}
