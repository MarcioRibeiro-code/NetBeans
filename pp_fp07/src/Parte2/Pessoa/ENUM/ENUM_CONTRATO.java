/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Parte2.Pessoa.ENUM;

/**
 *
 * @author pc
 */
public enum ENUM_CONTRATO {
    Parcial, Integral;

    public static ENUM_CONTRATO get_ENUM_CONTRATO(String contrato) {

        switch (contrato) {
            case "Integral":
                return ENUM_CONTRATO.Integral;
            default:
                return ENUM_CONTRATO.Parcial;

        }

    }

}
