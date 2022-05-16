/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte2.Unidade_Curricular;

import java.util.Arrays;

/**
 *
 * @author pc
 */
public class Unidade_Curricular {

    private String Nome;
    private char[] Sigla = new char[3];
    private String Nome_Curso;
    private char Ano_letivo;
    private char Semestre;

    public Unidade_Curricular(String Nome, String Nome_Curso, int Ano_letivo, int Semestre) {
        this.Nome = Nome;
        this.Sigla = this.Nome.substring(0, 3).toCharArray();
        this.Nome_Curso = Nome_Curso;
        this.Ano_letivo = Number_inRange(Ano_letivo);
        this.Semestre = Number_inRange(Semestre);
    }

    protected static char Number_inRange(int num) {

        if (num >= 1 && num <= 2) {
            return (char) num;
        }

        return '\0';
    }

    @Override
    public String toString() {
        return "---Unidade_Curricular---" + "\n Nome=" + Nome + "\n Sigla=" + Arrays.toString(Sigla) + "\n Nome_Curso=" + Nome_Curso + "\n Ano_letivo=" + Ano_letivo + "\n Semestre=" + Semestre;
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
        final Unidade_Curricular other = (Unidade_Curricular) obj;
        return Arrays.equals(this.Sigla, other.Sigla);
    }

    public String getNome() {
        return Nome;
    }


    public String getNome_Curso() {
        return Nome_Curso;
    }

    public char getAno_letivo() {
        return Ano_letivo;
    }

    public char getSemestre() {
        return Semestre;
    }

    
    
}
