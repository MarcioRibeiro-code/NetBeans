/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex4;

import java.util.Iterator;
import java.util.Collection;

/**
 *
 * @author PC
 */
public class Test_Collection {

    void printTest(Collection<Object> c) {
        /*
        Iterator i = c.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
         */
        
        for(Object e:c){
        System.out.println(e);
        }
        
        
    }

    void printCollection(Collection<?> c) {
        for (Object c1 : c) {
            System.out.println(c1);
        }
    }
}
