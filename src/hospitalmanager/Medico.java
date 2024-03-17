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
public class Medico extends Pessoa {

    private static List<Medico> medicos = new ArrayList<>();
    private String formacao;
    private int idMedico;
    private static int idenficadorEstaticoMedico;

    public Medico(String nome, char sexo, int idade, String formacao) {
        super(nome, sexo, idade);
        this.formacao = formacao;
        medicos.add(this);
        this.idMedico = this.idenficadorEstaticoMedico;
        idenficadorEstaticoMedico++;
    }

    public static List<Medico> getMedicos() {
        return medicos;
    }

    public static void setMedicos(List<Medico> medicos) {
        Medico.medicos = medicos;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

}
