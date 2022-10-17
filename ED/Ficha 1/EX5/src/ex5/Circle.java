/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5;

/**
 *
 * @author PC
 */
public class Circle<T> extends Shape<T> {

    public Circle() {
        setName(null);
    }

    public Circle(T name) {
        setName(name);
    }

    @Override
    public String toString() {
        return "This is a"+getName();
    }

    
    
    
    
}
