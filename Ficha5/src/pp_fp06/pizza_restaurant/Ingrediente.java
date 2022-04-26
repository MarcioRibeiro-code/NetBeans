/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_fp06.pizza_restaurant;

import pp_fp06.pizza_restaurant.enums.Origem_Enum;

/**
 *
 * @author pc
 */
public class Ingrediente {

    private static int CONTADOR = 0;
    private final String Codigo;
    private final String Nome;
    private final Origem_Enum origem;
    private final int numero_calorias;

    public Ingrediente(String Nome, Origem_Enum origem, int numero_calorias) {

        this.Codigo = Origem_Enum.cod(origem) + Ingrediente.CONTADOR;
        this.Nome = Nome;
        this.origem = origem;
        this.numero_calorias = numero_calorias;
        Ingrediente.CONTADOR++;
    }

    public String getCodigo() {
        return Codigo;
    }

    public int getNumero_calorias() {
        return numero_calorias;
    }

    
    
    @Override
    public String toString() {

        return "Ingrediente\n" + "Codigo=" + Codigo + "\nNome=" + Nome + "\norigem=" + origem + "\nnumero_calorias=" + numero_calorias;
    }

}
