/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.web;

import com.utfpr.entidades.Alimentos;
import com.utfpr.type.Tipo;
import java.util.ArrayList;
import java.util.Collection;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Marcele
 */
@ManagedBean
@RequestScoped
public class JsfDieta {
    @Id
    @GeneratedValue
    public long id;
    public String nome1;
    public String nome2;
    public Tipo tipo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }


    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    
    public void salvar() {
        com.utfpr.entidades.Alimentos dieta;
        dieta = new com.utfpr.entidades.Alimentos();
        dieta.setNome1(nome1);
        dieta.setNome2(nome2);
        dieta.setTipo(tipo);
        new com.utfpr.crud.CrudDieta().persist(dieta);
    }

    public Collection<Alimentos> getAll() {
        return new com.utfpr.crud.CrudDieta().getAll();
    }
}
