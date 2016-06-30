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
    private double basal;
    protected double percentual;

    public double getBasal() {
        return basal;
    }

    public void setBasal(double basal) {
        this.basal = basal;
    }

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

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
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

    public void calcularImc(){
        this.imc = (this.getPeso()) / (this.getAltura() * this.getAltura());
    }

    public String getStatusImc(){
        if ("feminino".equals(this.sexo)) {

            if (imc < 19.1) {
                return "Abaixo do peso";
            } else if ((imc > 19.1) && (imc < 25.8)) {
                return "Peso normal";
            } else if ((imc > 25.8) && (imc < 27.3)) {
                return "Marginalmente acima do peso";
            } else if ((imc > 27.3) && (imc < 32.3)) {
                return "Acima do peso ideal";
            } else
                return "Obeso";

        } else if ("masculino".equals(this.sexo)) {

            if (imc < 20.7) {
                return "Abaixo do peso";
            } else if ((imc > 20.7) && (imc < 26.4)) {
                return "Peso normal";
            } else if ((imc > 26.4) && (imc < 27.8)) {
                return "Marginalmente acima do peso";
            } else if ((imc > 27.8) && (imc < 31.1)) {
                return "Acima do peso ideal";
            } else
                return "Obeso";
        }

        return "Valor nao encontrado";
    }

    public void calcularBasal(){
        if ("feminino".equals(this.sexo)) {
            this.basal = 66.47 + (13.75 * this.peso) + (5 * this.altura) - (6.76 * this.idade);

        } else if ("masculino".equals(this.sexo)) {
            this.basal = 655.1 + (9.56 * this.peso) + (1.85 * this.altura) - (4.67 * this.idade);
        }
    }

    public void calcularPercentualGordura(){
        int sex = 0;
        if ("feminino".equals(this.sexo)) {
            sex = 0;
        } else if ("masculino".equals(this.sexo)) {
            sex = 1;
        }
        this.percentual = (((1.20 * this.imc) + (0.23 * this.idade) - (10.8 * sex)) - 5.4);
        //status = statusGordura(cliente.getIdade(),percentual, sexo);
    }
    
     
}
