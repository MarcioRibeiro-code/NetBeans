/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex5_maven;

/**
 *
 * @author PC
 */
public class Media<T1,T2> {
    private T1 name;
    private T2 number;

    public Media(T1 name,T2 number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Media{" + "name=" + name + ", number=" + number + '}';
    }

    
    
    
    
}
