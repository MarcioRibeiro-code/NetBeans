/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC
 */
public class EX5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape<String> shape = new Shape<>("Shape");

        Circle<String> cr = new Circle<>("Circle");
        Rectangle<String> rt = new Rectangle<>("Rectangle");

        List<Shape> list = new ArrayList<Shape>();

        list.add(rt);
        list.add(cr);
        list.add(shape);

        Canvas<String> canvas = new Canvas<>();

        canvas.draw(cr);
        canvas.drawAll(list);

        //NOT A SHAPE -> Testing
        /*
        List<String> test= new ArrayList<String>();
        test.add("a");
        test.add("b");
        
        canvas.draw(test);
         */
    }

}
