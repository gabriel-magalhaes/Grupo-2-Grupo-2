package com.utfpr.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by laisa on 12/06/2016.
 */
@Entity
public class RiscoCardiaco {
    @Id
    @GeneratedValue
    private long id;
    private int idade;
    private int sexo;
    private int peso;
    private int atividadeFisica;
    private int fumante;
    private int pressao;
    private int doenca;
    private int colesterol;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAtividadeFisica() {
        return atividadeFisica;
    }

    public void setAtividadeFisica(int atividadeFisica) {
        this.atividadeFisica = atividadeFisica;
    }

    public int getFumante() {
        return fumante;
    }

    public void setFumante(int fumante) {
        this.fumante = fumante;
    }

    public int getPressao() {
        return pressao;
    }

    public void setPressao(int pressao) {
        this.pressao = pressao;
    }

    public int getDoenca() {
        return doenca;
    }

    public void setDoenca(int doenca) {
        this.doenca = doenca;
    }

    public int getColesterol() {
        return colesterol;
    }

    public void setColesterol(int colesterol) {
        this.colesterol = colesterol;
    }
}
