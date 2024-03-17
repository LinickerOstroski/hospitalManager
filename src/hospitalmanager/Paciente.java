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
public class Paciente extends Pessoa {

    private static List<Paciente> pacientes = new ArrayList<>();
    private double valorTotalDeInternacao;
    private int idPaciente;
    private static int idenficadorEstaticoPaciente;

    public Paciente(String nome, char sexo, int idade) {
        super(nome, sexo, idade);
        this.idPaciente = this.idenficadorEstaticoPaciente;
        idenficadorEstaticoPaciente++;
        pacientes.add(this);
    }

    public void acrescentaInternacao(double valor) {
        this.valorTotalDeInternacao = this.valorTotalDeInternacao + valor;
    }

    public static List<Paciente> getPacientes() {
        return pacientes;
    }

    public double getValorTotalDeInternacao() {
        return valorTotalDeInternacao;
    }

    public void setValorTotalDeInternacao(double valorTotalDeInternacao) {
        this.valorTotalDeInternacao = valorTotalDeInternacao;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

}
