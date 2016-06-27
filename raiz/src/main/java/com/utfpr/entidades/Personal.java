/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.entidades;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import java.io.Serializable;
import com.utfpr.type.Tipo;
import javax.persistence.NamedQuery;


/**
 *
 * @author Tamires
 */
@NamedQuery(name = "Personal.findAll", query = "SELECT p FROM Personal p")
@Entity
public class Personal extends Pessoa implements Serializable {
    
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Tipo especialidade;
    public String pagina;
    public String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
     
    public Tipo getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Tipo especialidade) {
        this.especialidade = especialidade;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personal)) {
            return false;
        }
        Personal other = (Personal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.utfpr.entidades.Personal[ id=" + id + " ]";
    }

}
