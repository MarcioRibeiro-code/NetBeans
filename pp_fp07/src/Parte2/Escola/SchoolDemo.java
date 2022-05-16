/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parte2.Escola;

import Parte2.Pessoa.Aluno;
import Parte2.Pessoa.Funcionario;
import Parte2.Pessoa.Pessoa;
import Parte2.Pessoa.Professor;
import Parte2.Unidade_Curricular.Unidade_Curricular;
import java.util.Arrays;

/**
 *
 * @author pc
 */
public class SchoolDemo {

    private Pessoa[] pessoa = new Pessoa[30];
    protected static int contador_Pessoa = 0;
    protected static int contador_UC = 0;
    private Unidade_Curricular[] unidade_curricular = new Unidade_Curricular[4];

    //___________--GETTERS--_________________--
    public Unidade_Curricular[] getUnidade_curricular() {
        return unidade_curricular;
    }

    public Pessoa[] getPessoa() {
        return pessoa;
    }

    //____________--END GETTERS--________________
//  __________--ADD--__________________-
    public void add_professor(String Tipo_Contrato, String Nome, String Data_Nascimento, String Morada, String Num_CC, String Num_NIF) {

        if (SchoolDemo.contador_Pessoa < 30) {
            pessoa[contador_Pessoa++] = (Pessoa) new Professor(Tipo_Contrato, Nome, Data_Nascimento, Morada, Num_CC, Num_NIF);
        } else {
            System.out.println("MAX SIZE");
        }
    }

    public void add_aluno(String Nome, String Data_Nascimento, String Morada, String Num_CC, String Num_NIF) {

        if (SchoolDemo.contador_Pessoa < 30) {
            pessoa[contador_Pessoa++] = (Pessoa) new Aluno(Nome, Data_Nascimento, Morada, Num_CC, Num_NIF);
        } else {
            System.out.println("MAX SIZE");
        }
    }

    public void add_Funcionario(String Tipo_Contrato, String Nome, String Data_Nascimento, String Morada, String Num_CC, String Num_NIF) {

        if (SchoolDemo.contador_Pessoa < 30) {
            pessoa[contador_Pessoa++] = (Pessoa) new Funcionario(Tipo_Contrato, Nome, Data_Nascimento, Morada, Num_CC, Num_NIF);
        } else {
            System.out.println("MAX SIZE");
        }
    }

    public void add_UnidadeCurricular(String Nome, String Nome_Curso, int Ano_letivo, int Semestre) {
        if (SchoolDemo.contador_UC < this.unidade_curricular.length) {
            this.unidade_curricular[contador_UC++] = new Unidade_Curricular(Nome, Nome_Curso, Ano_letivo, Semestre);
        } else {
            System.out.println("MAX SIZE");
        }
    }

    public int add_UC_TO_People(String ID_Pessoa, String Sigla_UC) {

        char[] temp_ID_PE = ID_Pessoa.toCharArray();
        //char[] temp_Sigla_UC = Sigla_UC.toCharArray();

        if (search_UC_vSigla(Sigla_UC) == null && ID_Pessoa.substring(0, 2).equals("FA")) {
            return -1;
        }

        var temp_pessoas = this.getPessoa();
        for (int i = 0; i < SchoolDemo.contador_Pessoa; i++) {
            if (temp_pessoas[i] instanceof Professor) {
                Professor temp_professor = (Professor) temp_pessoas[i];
               // System.out.println(temp_professor.toString());
                if (Arrays.equals(temp_professor.getSigla(), temp_ID_PE)) {
                    temp_professor.addUnidade_curricular(search_UC_vSigla(Sigla_UC));
                    return 1;
                }

            } else {
                Aluno temp_aluno = (Aluno) temp_pessoas[i];
               // System.out.println(temp_aluno.toString());
                if (Arrays.equals(temp_aluno.getCodigo_Identificador(), temp_ID_PE)) {
                    temp_aluno.addUnidade_curricular(search_UC_vSigla(Sigla_UC));
                    return 1;
                }
            }
        }
        return -2;
    }
//__________END ADD STUFF__________________________________

    //Search STUFFF
    private Unidade_Curricular search_UC_vSigla(String Sigla_UC) {
        var temp_UCs = this.getUnidade_curricular();
        for (int i = 0; i < SchoolDemo.contador_UC; i++) {
            if (temp_UCs[i].equals(Sigla_UC.toCharArray())) {
                System.out.println(temp_UCs[i].getNome());
                return temp_UCs[i];
            }
        }
        return null;
    }
//____________END SEARCH STUFF____________________________________-

}
