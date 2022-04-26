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
public class Ementa {

    protected String Designacao;
    protected String Descricao;
    protected String Cod_ID;
    protected Date Data_Inicio;
    protected Date Data_Fim;
    protected int num_pizza = 0;
    protected Pizza[] pizza = new Pizza[10];

    private boolean ativo;

    public Ementa(String Designacao, String Descricao, String Cod_ID, Date Data_Inicio) {
        this.Designacao = Designacao;
        this.Descricao = Descricao;
        this.Cod_ID = "EM"+Cod_ID;
        this.Data_Inicio = Data_Inicio;
    }

    public Ementa(String Designacao, String Descricao, String Cod_ID, Date Data_Inicio, Date Data_Fim) {
        this.Designacao = Designacao;
        this.Descricao = Descricao;
        this.Cod_ID = Cod_ID;
        this.Data_Inicio = Data_Inicio;
        this.Data_Fim = Data_Fim;
    }

    public void setAtivo() {
        this.ativo = true;
    }

    public boolean isAtivo() {
        return ativo;
    }

    
    
    public void remAtivo() {
        this.ativo = false;
    }

    public void setNum_pizza() {
        this.num_pizza++;
    }

    public int getNum_pizza() {
        return num_pizza;
    }

    public void setPizza(Pizza pizza) {

        if (this.getNum_pizza() < Array_Size.MAX_VALUE.ordinal()) {
            this.pizza[this.getNum_pizza()] = pizza;
            this.setNum_pizza();

        } else {
            System.out.println("MAX Array-size: PIZZA");
        }
    }

    public Pizza[] getPizza() {
        return pizza;
    }

    public void setIngrediente(String ID, Ingrediente ing1) {

        Pizza[] temp_pizzas = this.getPizza();

        for (int i = 0; i < this.getNum_pizza(); i++) {
            if (temp_pizzas[i].getCodigo().equals(ID)) {
                // System.out.println("PZ COD" + temp_pizzas[i].getCodigo());
                temp_pizzas[i].setIngrediente(ing1);
            }
        }
    }

    public int Search_Ingredient_VID(String ID_ing) {
        Pizza[] temp = this.getPizza();
        for (int i = 0; i < this.getNum_pizza(); i++) {
            if (temp[i].Search_Ingredient_VID(ID_ing) != null) {
                System.out.println(temp[i].Search_Ingredient_VID(ID_ing).toString());
                return 1;
            }
        }
        return -1;
    }

    public String Calc_CalPizza(String ID_Pizza) {
        Pizza[] temp = this.getPizza();
        for (int i = 0; i < this.num_pizza; i++) {
            if (temp[i].getCodigo().equals(ID_Pizza)) {
                return Double.toString(temp[i].calc_calorias()) + " Cal";
            }
        }
        return "";
    }

    @Override
    public String toString() {

        if (Data_Fim != null && this.getNum_pizza() != 0) {

            String Pizzas = "";

            Pizza[] temp_pizza = this.getPizza();

            for (int i = 0; i < this.num_pizza; i++) {
                Pizzas += temp_pizza[i].toString() + "\n";
            }

            return "Ementa{" + "Designacao=" + Designacao + ", Descricao=" + Descricao + ", Cod_ID=" + Cod_ID + ", Data_Inicio=" + Date.toString(Data_Inicio) + ", Data_Fim=" + Date.toString(Data_Fim) + ", num_pizza=" + num_pizza + ", pizzas=" + Pizzas + '}';
        } else if (Data_Fim == null && this.getNum_pizza() != 0) {
            String Pizzas = "";

            Pizza[] temp_pizza = this.getPizza();

            for (int i = 0; i < this.num_pizza; i++) {
                Pizzas += temp_pizza[i].toString() + "\n";
            }
            return "Ementa:" + "\nDesignacao:" + Designacao + "\nDescricao:" + Descricao + "\nCod_ID:" + Cod_ID + "\nData_Inicio:" + Date.toString(Data_Inicio) + "\nnum_pizza:" + num_pizza + "\nPizzas:" + Pizzas + '}';
        } else {
            return "Ementa:" + "\nDesignacao:" + Designacao + "\nDescricao=" + Descricao + "\nCod_ID=" + Cod_ID + "\nData_Inicio=" + Date.toString(Data_Inicio) + "\nnum_pizza=" + num_pizza;
        }

    }

}
