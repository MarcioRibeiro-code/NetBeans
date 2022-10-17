/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5;

import java.util.List;

/**
 *
 * @author PC
 */
public class Canvas<T> {
    
    
    public void draw(Shape <String> shape){
    System.out.println(shape.toString());
    }
    
    public void drawAll(List<? extends Shape> ls){
    
        for(Object c:ls){
        System.out.println(c.toString());
        
        }
        
    }
    
    
}
