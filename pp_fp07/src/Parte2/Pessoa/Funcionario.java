/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte2.Pessoa;

import Parte2.Pessoa.ENUM.ENUM_CONTRATO;
import java.util.Arrays;

/**
 *
 * @author pc
 */
public class Funcionario extends Pessoa{
    private char[] Codigo_Identificador = new char[4];
    private static int CONTADOR_FUNC=0;
    private ENUM_CONTRATO Tipo_Contrato;


    public Funcionario(String Tipo_Contrato, String Nome, String Data_Nascimento, String Morada, String Num_CC, String Num_NIF) {
        super(Nome, Data_Nascimento, Morada, Num_CC, Num_NIF);
        this.Tipo_Contrato = ENUM_CONTRATO.get_ENUM_CONTRATO(Tipo_Contrato);
        this.Codigo_Identificador= ("FA"+ Funcionario.CONTADOR_FUNC++).toCharArray();
    }

    @Override
    public String toString() {
        return "---Funcionario---" + "\n Codigo_Identificador=" + Arrays.toString(Codigo_Identificador) + "\n Tipo_Contrato=" + Tipo_Contrato+"\n"+super.toString();
    }
    
    
    
    
    
}
