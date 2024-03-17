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
public class Internacao {

    private static List<Internacao> internacao = new ArrayList<>();
    private static int identificadorEstatico;
    private int identificador;

    private String motivoInternacao;
    private Medico medicoResponsavel;
    private Paciente pacienteInternado;
    private Enfermeiro enfermeiroResponsavel;
    private double custoInternacao;

    public Internacao(String motivoInternacao, Medico medico,
            Paciente paciente, Enfermeiro enfermeiro, double precoInternacao) {
        this.motivoInternacao = motivoInternacao;
        this.identificador = identificadorEstatico;
        this.identificadorEstatico++;
        this.enfermeiroResponsavel = enfermeiro;
        this.medicoResponsavel = medico;
        this.pacienteInternado = paciente;
        this.custoInternacao = precoInternacao;
        paciente.acrescentaInternacao(precoInternacao);
        this.internacao.add(this);
    }

    @Override
    public String toString() {
        return "Internação de numero: " + this.identificador
                + "\nPaciente: " + this.pacienteInternado.getNome()
                + "\nMedico que internou: " + this.medicoResponsavel.getNome()
                + "\nEnfermeiro que internou: " + this.enfermeiroResponsavel.getNome()
                + "\nPreço da internação: " + this.custoInternacao
                + "\nMotivo da internação: " + this.motivoInternacao;

    }

    public static List<Internacao> getInternacao() {
        return internacao;
    }

    public static void setInternacao(List<Internacao> internacao) {
        Internacao.internacao = internacao;
    }

    public static int getIdentificadorEstatico() {
        return identificadorEstatico;
    }

    public static void setIdentificadorEstatico(int identificadorEstatico) {
        Internacao.identificadorEstatico = identificadorEstatico;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getMotivoInternacao() {
        return motivoInternacao;
    }

    public void setMotivoInternacao(String motivoInternacao) {
        this.motivoInternacao = motivoInternacao;
    }

    public Medico getMedicoResponsavel() {
        return medicoResponsavel;
    }

    public void setMedicoResponsavel(Medico medicoResponsavel) {
        this.medicoResponsavel = medicoResponsavel;
    }

    public Paciente getPacienteInternado() {
        return pacienteInternado;
    }

    public void setPacienteInternado(Paciente pacienteInternado) {
        this.pacienteInternado = pacienteInternado;
    }

    public Enfermeiro getEnfermeiroResponsavel() {
        return enfermeiroResponsavel;
    }

    public void setEnfermeiroResponsavel(Enfermeiro enfermeiroResponsavel) {
        this.enfermeiroResponsavel = enfermeiroResponsavel;
    }

    public double getCustoInternacao() {
        return custoInternacao;
    }

    public void setCustoInternacao(double custoInternacao) {
        this.custoInternacao = custoInternacao;
    }

}
