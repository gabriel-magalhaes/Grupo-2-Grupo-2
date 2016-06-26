/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.entidades;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.*;


/**
 *
 * @author Heydi
 */
@NamedQuery(name = "Treino.findAll", query = "SELECT t FROM Treino t")
@Entity
public class Treino implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

   
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Treino)) {
            return false;
        }
        Treino other = (Treino) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.utfpr.entidades.Treino[ id=" + id + " ]";
    }
    
}
