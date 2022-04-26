/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp06.pizza_restaurant;

import java.util.Arrays;
import pp_fp06.pizza_restaurant.common_classes.Date;
import pp_fp06.pizza_restaurant.enums.Array_Size;

/**
 *
 * @author pc
 */
public class Ementas {

    private Ementa[] ementas = new Ementa[Array_Size.THREE.ordinal()];
    private static int contador = 0;

    public void addEmenta(String Designacao, String Descricao, Date Data_Inicio) {

        for (int i = 0; i < contador; i++) {
            this.ementas[i].remAtivo();
        }

        this.ementas[Ementas.contador] = new Ementa(Designacao, Descricao, String.valueOf(contador), Data_Inicio);
        this.ementas[Ementas.contador++].setAtivo();

    }

    public void setEmenta_Ativa(String ID_ementa) {
        for (int i = 0; i < contador; i++) {
            if (this.ementas[i].Cod_ID.equals(ID_ementa)) {
                this.ementas[i].setAtivo();
            } else {
                this.ementas[i].remAtivo();
            }
        }
    }

    public int remove_ingredient(String ID_Ementa) {

        int pos = -1;

        Ementa[] new_array = new Ementa[this.ementas.length];

        for (int i = 0; i < contador; i++) {
            if (this.ementas[i].Cod_ID.equals(ID_Ementa)) {
                pos = i;
                //temp_ing[i] = null;
                //this.setNum_Ingredientes('-');
            }
        }

        if (pos != -1) {
            for (int i = 0, k = 0; i <= contador; i++) {

                if (pos != i) {
                    // System.out.println("k" + k);
                    new_array[k++] = this.ementas[i];

                } else {
                    contador--;
                }

            }

            //System.out.println(Arrays.toString(new_array));
            this.ementas = new_array;

            return 1;
        }

        //System.out.println(Arrays.toString(new_array));
        return -1;
    }

    public static int getContador() {
        return contador;
    }

    @Override
    public String toString() {

        String Ativ = "\n--ATIVO--\n";
        String N_Ativ = "\n--NAO ATIVO--\n";
        for (int i = 0; i < Ementas.contador; i++) {
            if (this.ementas[i].isAtivo()) {
                Ativ += "\n" + this.ementas[i].toString() + "\n---------------";
            } else {
                N_Ativ += this.ementas[i].toString() + "\n";
            }
        }
        return Ativ + N_Ativ + "-----------";
    }
}
