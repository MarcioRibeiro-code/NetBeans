/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3_parte1;

/**
 *
 * Não entendi este exercicio
 */
public class EX3_Parte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UnorderedPair<String> p1
                = new UnorderedPair<String>("peanuts", "beer");
        UnorderedPair<String> p2
                = new UnorderedPair<String>("beer", "peanuts");
        if (p1.equals(p2)) {
            System.out.println(p1.getFirst() + " and "
                    + p1.getSecond() + " is the same as");
            System.out.println(p2.getFirst() + " and "
                    + p2.getSecond());
        }
    }

}
