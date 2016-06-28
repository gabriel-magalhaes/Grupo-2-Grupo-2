package com.utfpr.web;

import com.utfpr.crud.CrudCliente;
import com.utfpr.entidades.Cliente;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;


/**
 * Created by laisa on 26/06/2016.
 */
@ManagedBean
@SessionScoped
public class JsfLogin implements Serializable {

    public String email;
    public String senha;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String entrar() {
        Cliente cliente = new CrudCliente().validarCliente(email, senha);
        if (cliente != null) {
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("email", email);
            return "principalCliente?faces-redirect=true";
        }
        return "login?faces-redirect=true";
    }

    public String sair() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "login?faces-redirect=true";
    }

}
