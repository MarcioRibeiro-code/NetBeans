/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Store {

    private List<Media> ls = new ArrayList();

    public <T extends Media> void add(T t) {

        int position = -1;

        if (!ls.contains(t)) {
            ls.add(t);
        } else {

            for (int i = 0; i < ls.size(); i++) {
                if (ls.get(i).equals(t)) {
                    System.out.println("ENCONTRADO");

                    Integer value = (Integer) ls.get(i).getQuantity();

                    ls.get(i).setQuantity(++value);
                }
            }
        }

    }

    private String Ls_Option() {
        String res = "";
        for (int i = 0; i < ls.size(); i++) {
            res += i + " - UUID:" + ls.get(i).getUuid().toString() + "; Quantity:" + ls.get(i).getQuantity().toString() + "\n";
        }
        return res;
    }

    public void remove() {

        Scanner scan = new Scanner(System.in);

        System.out.println("1 - Remove Item (Quantity)");
        System.out.println("2 - Remove via UUID (Item from List)");
        System.out.println("3 - Remove All");
        System.out.print("Opcao:");

        int i = scan.nextInt();
        switch (i) {
            case 1:
                System.out.println(Ls_Option());
                System.out.print("Opcao: ");

                remove_Item(scan.nextInt());
                break;
            case 2:
                System.out.println(Ls_Option());
                System.out.print("Opcao: ");

                remove_vUUID(scan.nextInt());
                break;
            case 3:
                remove_all();
                break;
        }
    }

    //Update Quantity
    private void remove_Item(int index) {

        Integer value = (Integer) ls.get(index).getQuantity();

        if (--value > 0) {  
            ls.get(index).setQuantity(value);
        }else{
        ls.remove(index);
        }

    }

//Remove ALL
    private void remove_all() {
        ls.clear();
    }

    //Remover O elemento com o UUID
    private void remove_vUUID(int index) {

        ls.remove(index);

    }

    @Override
    public String toString() {
        String res = "";

        for (int i = 0; i < ls.size(); i++) {
            res += ls.get(i).toString();
        }

        if(!res.isBlank()){
        return res;
        }
        
        
        return "Store is empty";
    }

}
