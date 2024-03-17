/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanager;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Iksortso K2
 */
public class Enfermeiro extends Pessoa {

    private static List<Enfermeiro> enfermeiros = new ArrayList<>();
    private int idEnfermeiro;
    private static int idenficadorEstaticoEnfermeiro;

    public Enfermeiro(String nome, char sexo, int idade) {
        super(nome, sexo, idade);
        this.idEnfermeiro = this.idenficadorEstaticoEnfermeiro;
        idenficadorEstaticoEnfermeiro++;
        enfermeiros.add(this);
    }

    public static List<Enfermeiro> getEnfermeiros() {
        return enfermeiros;
    }

    public static void setEnfermeiros(List<Enfermeiro> enfermeiros) {
        Enfermeiro.enfermeiros = enfermeiros;
    }

    public int getIdEnfermeiro() {
        return idEnfermeiro;
    }

    public void setIdEnfermeiro(int idEnfermeiro) {
        this.idEnfermeiro = idEnfermeiro;
    }

    public static int getIdenficadorEstaticoEnfermeiro() {
        return idenficadorEstaticoEnfermeiro;
    }

    public static void setIdenficadorEstaticoEnfermeiro(int idenficadorEstaticoEnfermeiro) {
        Enfermeiro.idenficadorEstaticoEnfermeiro = idenficadorEstaticoEnfermeiro;
    }

}
