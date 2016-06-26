/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.entidades;

import com.utfpr.type.Tipo;
import com.utfpr.type.TipoPersonal;
import java.io.Serializable;
import java.net.URL;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 *
 * @author Tamires
 */
@NamedQuery(name = "Personal.findAll", query = "SELECT p FROM Personal p")
@Entity
public class CadastroPersonal extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    public Tipo especialidade;
    private URL pagina;

    public Tipo getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Tipo especialidade) {
        this.especialidade = especialidade;
    }

    public URL getPagina() {
        return pagina;
    }

    public void setPagina(URL pagina) {
        this.pagina = pagina;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CadastroPersonal)) {
            return false;
        }
        CadastroPersonal other = (CadastroPersonal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.utfpr.entidades.CadastroPersonal[ id=" + id + " ]";
    }
    
}
