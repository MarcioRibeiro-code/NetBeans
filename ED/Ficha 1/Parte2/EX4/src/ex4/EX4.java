/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

        List<String> ar = new ArrayList<String>();
        ar.add("a");
        ar.add("bb");
        ar.add("aaaa");
        ar.add("aaa");

       Collections.sort(ar,Comparator.comparingInt(String::length));
       
       System.out.println(ar.toString());
    }

 

}
