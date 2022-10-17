/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ex5_maven;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class EX5_maven {

    public static void main(String[] args) {
       
        List<Media> ls = new ArrayList(); 
        
        ls.add(new Book<>("123", 1));
       System.out.println(ls.toString()); 
        
        
    }
}
