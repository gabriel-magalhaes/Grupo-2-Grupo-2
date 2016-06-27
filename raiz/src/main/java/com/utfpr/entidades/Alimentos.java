/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.entidades;

import com.utfpr.type.Tipo;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import javax.persistence.NamedQuery;

/**
 *
 * @author Marcele
 */
@NamedQuery(name = "Alimentos.findAll", query = "SELECT a FROM Alimentos a")
@Entity
public class Alimentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public String nome1;
    public String nome2;
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


    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo1) {
        this.tipo = tipo;
    }


    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alimentos)) {
            return false;
        }
        Alimentos other = (Alimentos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.utfpr.entidades.Alimentos[ id=" + id + " ]";
    }
    
}
