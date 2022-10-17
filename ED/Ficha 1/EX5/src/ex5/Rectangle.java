/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5;

/**
 *
 * @author PC
 */
public class Rectangle<T> extends Shape<T> {

    public Rectangle() {
        setName(null);
    }

    public Rectangle(T name) {
        setName(name);
    }

    @Override
    public String toString() {
        return getName()+" this is a";
    }

    
    
    
    
}
