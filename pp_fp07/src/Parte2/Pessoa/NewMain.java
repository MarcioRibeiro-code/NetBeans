/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Parte2.Pessoa;

import Parte2.Escola.SchoolDemo;

/**
 *
 * @author pc
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Professor pf1 = new Professor("Integral", "MARCIO", "20/12/2001", "RUA RUA", "000000000", "111111111");
        SchoolDemo sd1 = new SchoolDemo();

        sd1.add_professor("Integral", "MARCIO Samuel", "20/12/2001", "RUA RUA", "000000000", "111111111");
        sd1.add_UnidadeCurricular("Paradigmas Da Programacao", "LEI", 1, 2);
       // System.out.println(sd1.toString());
        System.out.println(sd1.add_UC_TO_People("PFMS", "PAR"));
        System.out.println(sd1.toString());
        //System.out.println(pf1.toString());
    }

}
