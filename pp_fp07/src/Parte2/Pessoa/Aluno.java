/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte2.Pessoa;

import Parte2.Unidade_Curricular.Unidade_Curricular;
import java.util.Arrays;

/**
 *
 * @author pc
 */
public class Aluno extends Pessoa {

    private char[] Codigo_Identificador;
    protected static int Contador = 0;
    private Unidade_Curricular[] UC = new Unidade_Curricular[10];

    public Aluno(String Nome, String Data_Nascimento, String Morada, String Num_CC, String Num_NIF) {
        super(Nome, Data_Nascimento, Morada, Num_CC, Num_NIF);
        this.Codigo_Identificador = ("AL" + Contador++).toCharArray();
    }

    public char[] getCodigo_Identificador() {
        return Codigo_Identificador;
    }

    
    
    
    
    
    public int addUnidade_curricular(Unidade_Curricular temp) {

        if (Contador < this.UC.length) {
            this.UC[Contador++] = temp;
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "---Aluno---" + "\nCodigo_Identificador=" + Arrays.toString(Codigo_Identificador) + "\nUC=" + Arrays.toString(UC);
    }

}
