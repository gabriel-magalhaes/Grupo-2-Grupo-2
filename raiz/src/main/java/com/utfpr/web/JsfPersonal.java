/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.web;

import com.utfpr.entidades.Personal;
import com.utfpr.type.Tipo;
import java.net.URL;
import java.util.Collection;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Tamires
 */
@ManagedBean
@RequestScoped
public class JsfPersonal {
    
    @Id
    @GeneratedValue
    public long id;
    public String pagina;
    public Tipo especialidade;
    //public String nome;
    //public String rua;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public Tipo getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Tipo especialidade) {
        this.especialidade = especialidade;
    }
    
    
     
     public void salvar() {
        com.utfpr.entidades.Personal pers;
        pers = new com.utfpr.entidades.Personal();
        pers.setEspecialidade(especialidade);
        pers.setPagina(pagina); 
        new com.utfpr.crud.CrudPersonal().persist(pers);
    }

    public Collection<Personal> getAll() {
        return new com.utfpr.crud.CrudPersonal().getAll();
    }
}
