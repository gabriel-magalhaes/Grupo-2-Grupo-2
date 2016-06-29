package com.utfpr.web;

import com.utfpr.crud.CrudCliente;
import com.utfpr.crud.CrudPersonal;
import com.utfpr.entidades.Cliente;
import com.utfpr.entidades.Personal;

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
    private Cliente cli;

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

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }
       
    public String entrarCliente() {
        Cliente cliente = new CrudCliente().validarCliente(email, senha);
        if (cliente != null) {
            cli =cliente;
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("email", email);
            if((cliente.getEmail()).equalsIgnoreCase("admin@gmail.com")){ //� admin
                 return "admin?faces-redirect=true";
            }
            return "principalCliente?faces-redirect=true";
         
        }
        return "login?faces-redirect=true";
    }
    
    public String entrarPersonal() {
        Personal personal = new CrudPersonal().validarPersonal(email, senha);
        if (personal != null) {
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("email", email);
            return "principalPersonal?faces-redirect=true";
        }
        return "login?faces-redirect=true";
    }
    
    public String sair() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "login?faces-redirect=true";
    }

}
