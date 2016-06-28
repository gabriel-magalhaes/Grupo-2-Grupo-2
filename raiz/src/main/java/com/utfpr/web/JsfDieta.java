/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.web;

import com.utfpr.entidades.Alimentos;
import com.utfpr.type.Tipo;
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

    public Long id;
    public String nome1;
    public String nome2;
    public String nome3;
    public String nome4;
    public String nome5;
    public String nome6;
    public Tipo tipo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getNome3() {
        return nome3;
    }

    public void setNome3(String nome3) {
        this.nome3 = nome3;
    }

    public String getNome4() {
        return nome4;
    }

    public void setNome4(String nome4) {
        this.nome4 = nome4;
    }

    public String getNome5() {
        return nome5;
    }

    public void setNome5(String nome5) {
        this.nome5 = nome5;
    }

    public String getNome6() {
        return nome6;
    }

    public void setNome6(String nome6) {
        this.nome6 = nome6;
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
        dieta.setNome3(nome3);
        dieta.setNome3(nome3);
        dieta.setNome4(nome4);
        dieta.setNome5(nome5);
        dieta.setNome6(nome6);
        dieta.setTipo(tipo);

        new com.utfpr.crud.CrudDieta().persist(dieta);
    }
  

    public void remove(com.utfpr.entidades.Alimentos dieta) {
        new com.utfpr.crud.CrudDieta().remove(dieta);

    }

    public void merge() {
        com.utfpr.entidades.Alimentos dieta;
        dieta=new com.utfpr.entidades.Alimentos();
        dieta.setId(id);
        dieta.setNome1(nome1);
        dieta.setNome2(nome2);
        dieta.setNome3(nome3);
        dieta.setNome3(nome3);
        dieta.setNome4(nome4);
        dieta.setNome5(nome5);
        dieta.setNome6(nome6);
        dieta.setTipo(tipo);
        new com.utfpr.crud.CrudDieta().update(dieta);

    }

    public void load_data(com.utfpr.entidades.Alimentos dieta) {
        this.id = dieta.getId();
        this.nome1 = dieta.getNome1();
        this.nome2 = dieta.getNome2();
        this.nome3 = dieta.getNome3();
        this.nome4 = dieta.getNome4();
        this.nome5 = dieta.getNome5();
        this.nome6 = dieta.getNome6();
        this.tipo=dieta.getTipo();

    }

    public Collection<Alimentos> getAll() {
        return new com.utfpr.crud.CrudDieta().getAll();
    }
}
