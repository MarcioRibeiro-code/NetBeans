/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte2.Pessoa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
/**
 *
 * @author pc
 */
public abstract class Pessoa {

    private String Nome;
    private Date Data_Nascimento;
    private String Morada;
    private char[] Num_CC = new char[9];
    private char[] Num_NIF = new char[9];

    
    
    
    
    
    public Pessoa(String Nome, String Data_Nascimento, String Morada, String Num_CC, String Num_NIF) {
        this.Nome = Nome;

        try {
            this.Data_Nascimento = new SimpleDateFormat("dd/MM/yyyy").parse(Data_Nascimento);
        } catch (ParseException ex) {
            this.Data_Nascimento = null;
        }
        this.Morada = Morada;

        this.Num_CC = char_inSize(Num_CC.toCharArray());
        this.Num_NIF = char_inSize(Num_NIF.toCharArray());
    }

    private static char[] char_inSize(char[] var_) {

        char[] temp = new char[9];
        for (int i = 0; i < var_.length; i++) {
            temp[i] = var_[i];
        }
        if (var_[0] == 0) {
            return null;
        }

        return temp;
    }

    public String getNome() {
        return Nome;
    }

    
    
    
    
    
    
    @Override
    public String toString() {
        return "---Pessoa---" + "\nNome=" + Nome + "\nData_Nascimento=" + Data_Nascimento + "\nMorada=" + Morada + "\nNum_CC=" + Arrays.toString(Num_CC) + "\nNum_NIF=" + Arrays.toString(Num_NIF);
    }

    
    
    
    
    
}
