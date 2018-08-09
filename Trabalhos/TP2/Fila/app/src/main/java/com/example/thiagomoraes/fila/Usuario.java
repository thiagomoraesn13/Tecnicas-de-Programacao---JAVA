package com.example.thiagomoraes.fila;

import java.io.Serializable;

/**
 * Created by thiagomoraes on 05/01/16.
 */
public class Usuario implements Serializable {
    private  static  final long serialVersionUID = 1L;
    private  String nome, cpf, medico, data, horario, prioridade;

    public Usuario(String nome,String cpf,String medico,String data,String horario,String prioridade){
        this.nome = nome;
        this.cpf = cpf;
        this.medico = medico;
        this.data = data;
        this.horario = horario;
        this.prioridade = prioridade;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void stPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }
}
