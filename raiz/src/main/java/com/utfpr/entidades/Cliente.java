package com.utfpr.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Calendar;
import java.util.Date;

/*
 * Created by laisa on 12/06/2016.
 */
@Entity
public class Cliente extends Pessoa {
 

    private float altura;
    private float peso;
    private float imc;
    private int idade;
    private RiscoCardiaco risco;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public RiscoCardiaco getRisco() {
        return risco;
    }

    public void setRisco(RiscoCardiaco risco) {
        this.risco = risco;
    }

    @Override
    public void setNascimento(Date nascimento) {
        super.setNascimento(nascimento);
        this.idade = calcularIdade(nascimento, new Date());
    }
    
    public int calcularIdade(Date nascimento, Date atual) {
        Calendar calNasc = Calendar.getInstance();
        calNasc.setTime(nascimento);
        Calendar calAtual = Calendar.getInstance();
        calAtual.setTime(atual);
        int anos = calAtual.get(Calendar.YEAR) - calNasc.get(Calendar.YEAR);
        int meses = calAtual.get(Calendar.MONTH) - calNasc.get(Calendar.MONTH);
        int dias = calAtual.get(Calendar.DAY_OF_MONTH) - calNasc.get(Calendar.DAY_OF_MONTH);
        if (meses < 0) {
            anos--;
        } else if (meses == 0) {
            if (dias < 0) {
                anos--;
            }
        }
        return anos;
    }
    
     
}
