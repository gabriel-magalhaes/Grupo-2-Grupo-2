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
//
/**
 *
 * @author Heydi
 */
@ManagedBean
@RequestScoped
public class JsfTreino {

    public int id;
    public String exercicio;
    public String repeticao;
    public int tipo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExercicio() {
        return exercicio;
    }

    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
    }

    public String getRepeticao() {
        return repeticao;
    }

    public void setRepeticao(String repeticao) {
        this.repeticao = repeticao;
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
        exer.setExercicio(exercicio);
        exer.setRepeticao(repeticao);
        exer.setTipo(tipo);
        new com.utfpr.crud.CrudTreino().persist(exer);
    }

    public Collection<Treino> getAll() {
        return new com.utfpr.crud.CrudTreino().getAll();
    }
}
