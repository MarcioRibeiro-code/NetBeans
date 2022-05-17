/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte2.Pessoa;

import Parte2.Pessoa.ENUM.ENUM_CONTRATO;
import Parte2.Unidade_Curricular.Unidade_Curricular;
import java.util.Arrays;

/**
 *
 * @author pc
 */
public class Professor extends Pessoa {

    private char[] Sigla = new char[5];
    private ENUM_CONTRATO Tipo_Contrato;
    protected int CONTADOR_UNIDADE_CURRICULAR = 0;
    private Unidade_Curricular[] unidade_curricular = new Unidade_Curricular[5];

    public Professor(String Tipo_Contrato, String Nome, String Data_Nascimento, String Morada, String Num_CC, String Num_NIF) {
        super(Nome, Data_Nascimento, Morada, Num_CC, Num_NIF);
        this.Sigla = ("PF" + Professor.makeSigla(super.getNome())).toCharArray();
        this.Tipo_Contrato = ENUM_CONTRATO.get_ENUM_CONTRATO(Tipo_Contrato);
    }

    private static String makeSigla(String Nome) {
        String[] names = Nome.split("\\s+");
        int contador = 0;
        String temp = "";
        for (String name : names) {
            if (contador > 3) {
                break;
            }
            temp += name.substring(0, 1);
            contador++;
        }
        return temp;
    }

    public char[] getSigla() {
        return Sigla;
    }

    public int addUnidade_curricular(Unidade_Curricular temp) {

        if (CONTADOR_UNIDADE_CURRICULAR < this.unidade_curricular.length) {
            //System.out.println("\n UNIDADE C"+temp.toString());
            this.unidade_curricular[CONTADOR_UNIDADE_CURRICULAR++] = temp;
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "\n---Professor---" + "\n Sigla=" + Arrays.toString(Sigla) + "\n Tipo_Contrato=" + Tipo_Contrato + "\n CONTADOR_UNIDADE_CURRICULAR=" + CONTADOR_UNIDADE_CURRICULAR + "\n unidade_curricular=" + Arrays.toString(unidade_curricular) + "\n" + super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final char[] other = (char[]) obj;
        System.out.println("\n ABC" + Arrays.toString(this.Sigla));
        System.out.println("\n CBD" + other);

        return Arrays.equals(this.Sigla, other);
    }

}
