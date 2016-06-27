/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.entidades;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Tamires
 */
public class Pessoa extends Endereco {
    
    @Id
    @GeneratedValue
    public Long id;
    public String nome;
    public String email;
    public String sexo;
    public String telefone;
    public String celular;
    public String nascimentoPersonal;
    public Date nascimento;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNascimentoPersonal() {
        return nascimentoPersonal;
    }

    public void setNascimentoPersonal(String nascimentoPersonal) {
        this.nascimentoPersonal = nascimentoPersonal;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    
    
}
