/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TwoTypePair<String, String> secretPair = new TwoTypePair<String, String>("1", "2");

        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        String n1 = Keyboard.next();
        String n2 = Keyboard.next();
        TwoTypePair<String,String> inputPair = new TwoTypePair<String,String>(n1, n2);
        if (inputPair.equals(secretPair)) {
            System.out.println("You guesses the secret numbers");
            System.out.println("in the correct two order!");
        } else {
            System.out.println("You guesses incorrectly.");
            System.out.println("You guessed");
            System.out.println(inputPair);
            System.out.println("The secret numbers are");
            System.out.println(secretPair);
        }
    }

}
