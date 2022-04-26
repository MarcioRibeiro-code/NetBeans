/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp06.pizza_restaurant;

import java.util.Arrays;
import pp_fp06.pizza_restaurant.enums.Array_Size;
import pp_fp06.pizza_restaurant.enums.Tamanho_Enum;

/**
 *
 * @author pc
 */
public class Pizza {

    protected final String Codigo;
    protected final String Nome;
    protected String Descricao;
    protected double Preco;
    protected Tamanho_Enum tamanho;
    private int Num_Ingredientes = 0;
    protected Ingrediente[] ingredientes = new Ingrediente[Array_Size.MAX_VALUE.ordinal()];

    public String getCodigo() {
        return Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public double getPreco() {
        return Preco;
    }

    public Tamanho_Enum getTamanho() {
        return tamanho;
    }

    public int getNum_Ingredientes() {
        //System.out.println("NI" + Num_Ingredientes);
        return Num_Ingredientes;
    }

    public void setNum_Ingredientes(char char_) {
        switch (char_) {
            case '-':
                this.Num_Ingredientes--;
                break;
            case '+':
                // System.out.println("NN" + this.Num_Ingredientes);
                this.Num_Ingredientes++;
                //System.out.println("NN" + this.Num_Ingredientes);
                break;
            // System.out.println("NN" + this.Num_Ingredientes);
            default:;
        }
    }

    public Pizza(String Codigo, String Nome, String Descricao, double Preco, Tamanho_Enum tamanho) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Descricao = Descricao;
        this.Preco = Preco;
        this.tamanho = tamanho;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngrediente(Ingrediente ingredientes) {

        // System.out.println(Array_Size.MAX_VALUE.ordinal());
        if (this.getNum_Ingredientes() < Array_Size.MAX_VALUE.ordinal()) {
            this.ingredientes[this.getNum_Ingredientes()] = ingredientes;
            this.setNum_Ingredientes('+');
            //System.out.println(this.Num_Ingredientes);
        } else {
            System.out.println("MAX ARRAY SIZE - Ingredientes");
        }
    }

    public int remove_ingredient(String ID) {

        int pos = -1;
        Ingrediente[] temp_ing = this.getIngredientes();
        Ingrediente[] new_array = new Ingrediente[Array_Size.MAX_VALUE.ordinal()];

        for (int i = 0; i < this.getNum_Ingredientes(); i++) {
            if (temp_ing[i].getCodigo().equals(ID)) {
                pos = i;
                //temp_ing[i] = null;
                //this.setNum_Ingredientes('-');
            }
        }

        if (pos != -1) {
            for (int i = 0, k = 0; i <= this.getNum_Ingredientes(); i++) {

                if (pos != i) {
                    // System.out.println("k" + k);
                    new_array[k++] = temp_ing[i];

                } else {
                    this.setNum_Ingredientes('-');
                }

            }

            //System.out.println(Arrays.toString(new_array));
            this.ingredientes = new_array;

            return 1;
        }

        //System.out.println(Arrays.toString(new_array));
        return -1;
    }

    public Ingrediente Search_Ingredient_VID(String ID_ing) {

        Ingrediente[] temp = this.getIngredientes();

        for (int i = 0; i < this.getNum_Ingredientes(); i++) {
            if (temp[i].getCodigo().equals(ID_ing)) {
                return temp[i];
            }
        }
        return null;
    }

    public double calc_calorias() {

        Ingrediente[] ingredientes1 = this.getIngredientes();
        int cont = 0;

        for (int i = 0; i < this.getNum_Ingredientes(); i++) {
            cont += ingredientes1[i].getNumero_calorias();
        }
        return cont;
    }

    @Override
    public String toString() {

        if (this.getNum_Ingredientes() != 0) {

            String Ingredientes = "";
            Ingrediente[] temp_ingredientes = this.getIngredientes();
            for (int i = 0; i < this.getNum_Ingredientes(); i++) {
                Ingredientes += temp_ingredientes[i].toString() + "\n";
            }

            return "\nPizza -> " + this.getNome() + "\nCodigo: " + this.getCodigo() + "\nDescricao: " + this.getDescricao() + "\nPreco: " + this.getPreco() + "€\nNumero de Ingredientes: " + this.getNum_Ingredientes() + "\nIngredientes: " + Ingredientes;
        } else {
            return "\nPizza -> " + this.getNome() + "\nCodigo: " + this.getCodigo() + "\nDescricao: " + this.getDescricao() + "\nPreco: " + this.getPreco() + "€\nNumero de Ingredientes: " + this.getNum_Ingredientes();

        }

        //return "Pizza{" + "Codigo=" + Codigo + ", Nome=" + Nome + ", Descricao=" + Descricao + ", Preco=" + Preco + ", tamanho=" + tamanho + ", Num_Ingredientes=" + Num_Ingredientes + ", ingredientes=" + ingredientes + '}';
    }

}
