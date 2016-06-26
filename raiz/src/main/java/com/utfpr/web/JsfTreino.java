/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import com.utfpr.entidades.Treino;
import java.util.Collection;

/**
 *
 * @author Heydi
 */
@ManagedBean
@RequestScoped
public class JsfTreino {

    public int id;
    public String exercicio1;
    public String repeticao1;
    public String exercicio2;
    public String repeticao2;
    public String exercicio3;
    public String repeticao3;
    public String exercicio4;
    public String repeticao4;
    public String exercicio5;
    public String repeticao5;
    public String exercicio6;
    public String repeticao6;
    public int tipo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExercicio1() {
        return exercicio1;
    }

    public void setExercicio1(String exercicio1) {
        this.exercicio1 = exercicio1;
    }

    public String getRepeticao1() {
        return repeticao1;
    }

    public void setRepeticao1(String repeticao1) {
        this.repeticao1 = repeticao1;
    }

    public String getExercicio2() {
        return exercicio2;
    }

    public void setExercicio2(String exercicio2) {
        this.exercicio2 = exercicio2;
    }

    public String getRepeticao2() {
        return repeticao2;
    }

    public void setRepeticao2(String repeticao2) {
        this.repeticao2 = repeticao2;
    }

    public String getExercicio3() {
        return exercicio3;
    }

    public void setExercicio3(String exercicio3) {
        this.exercicio3 = exercicio3;
    }

    public String getRepeticao3() {
        return repeticao3;
    }

    public void setRepeticao3(String repeticao3) {
        this.repeticao3 = repeticao3;
    }

    public String getExercicio4() {
        return exercicio4;
    }

    public void setExercicio4(String exercicio4) {
        this.exercicio4 = exercicio4;
    }

    public String getRepeticao4() {
        return repeticao4;
    }

    public void setRepeticao4(String repeticao4) {
        this.repeticao4 = repeticao4;
    }

    public String getExercicio5() {
        return exercicio5;
    }

    public void setExercicio5(String exercicio5) {
        this.exercicio5 = exercicio5;
    }

    public String getRepeticao5() {
        return repeticao5;
    }

    public void setRepeticao5(String repeticao5) {
        this.repeticao5 = repeticao5;
    }

    public String getExercicio6() {
        return exercicio6;
    }

    public void setExercicio6(String exercicio6) {
        this.exercicio6 = exercicio6;
    }

    public String getRepeticao6() {
        return repeticao6;
    }

    public void setRepeticao6(String repeticao6) {
        this.repeticao6 = repeticao6;
    }
    


    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void salvar() {
        com.utfpr.entidades.Treino exer;
        exer = new com.utfpr.entidades.Treino();
        exer.setExercicio1(exercicio1);
        exer.setRepeticao1(repeticao1);
        exer.setExercicio2(exercicio2);
        exer.setRepeticao2(repeticao2);
        exer.setExercicio3(exercicio3);
        exer.setRepeticao3(repeticao3);
        exer.setExercicio4(exercicio4);
        exer.setRepeticao4(repeticao4);
        exer.setExercicio5(exercicio5);
        exer.setRepeticao5(repeticao5);
        exer.setExercicio6(exercicio6);
        exer.setRepeticao6(repeticao6);
        exer.setTipo(tipo);
        new com.utfpr.crud.CrudTreino().persist(exer);
    }

    public Collection<Treino> getAll() {
        return new com.utfpr.crud.CrudTreino().getAll();
    }
}
