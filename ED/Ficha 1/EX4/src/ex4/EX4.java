/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class EX4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Stones st = new Stones();

        /*
        Como tipos primitivos não extendem Object ao termos a assinatura Object na funcao printTest não podemos imprimir
        
        */
        
        ArrayList<Integer> ar = new ArrayList<Integer>();
        
        ar.add(1);
        ar.add(2);
        ar.add(3);

        Test_Collection tc = new Test_Collection();

        tc.printCollection(ar);
        tc.printTest(ar);
    }

}
