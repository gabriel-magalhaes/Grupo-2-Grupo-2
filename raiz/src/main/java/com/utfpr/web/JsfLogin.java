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
    private Cliente cli;
    private double basal;

    public double getBasal() {
        return basal;
    }

    public void setBasal(double basal) {
        this.basal = basal;
    }
    
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

    
    public String entrar() {
        Cliente cliente = new CrudCliente().validarCliente(email, senha);
        if (cliente != null) {
            cli =cliente;
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("email", email);
            if((cliente.getEmail()).equalsIgnoreCase("heydi@gmail.com")){ //é admin
                 return "admin?faces-redirect=true";
            }
            return "principalCliente?faces-redirect=true";
         
        }
        return "login?faces-redirect=true";
    }

     public void calculoBasal() {      
        if ("feminino".equals(cli.getSexo())) {
            basal = 66.47 + (13.75 * cli.getPeso()) + (5 * cli.getAltura()) - (6.76 * cli.getIdade());
            
        } else if ("masculino".equals(cli.getSexo())) {
            basal = 655.1 + (9.56 * cli.getPeso()) + (1.85 * cli.getAltura()) - (4.67 * cli.getIdade());
           
        }
        
    }
    public String sair() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "login?faces-redirect=true";
    }

}
