/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.web;

import com.utfpr.entidades.Personal;
import com.utfpr.type.Tipo;
import java.util.Collection;
import java.util.Date;
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
    public String nome;
    public String email;
    public String sexo;
    public String telefone;
    public String celular;
    public String nascimentoPersonal;
    public String rua;
    public int numero;
    public String bairro;
    public String cidade;
    public String estado;
    public int cep;
    public String pais;
    public String complemento;

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

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void salvar() {
        com.utfpr.entidades.Personal pers;
        pers = new com.utfpr.entidades.Personal();
        pers.setEspecialidade(especialidade);
        pers.setPagina(pagina); 
        pers.setNome(nome);
        pers.setEmail(email);
        pers.setSexo(sexo);
        pers.setTelefone(telefone);
        pers.setCelular(celular);
        pers.setNascimentoPersonal(nascimentoPersonal);
        pers.setRua(rua);
        pers.setNumero(numero);
        pers.setBairro(bairro);
        pers.setCidade(cidade);
        pers.setEstado(estado);
        pers.setCep(cep);
        pers.setPais(pais);
        pers.setComplemento(complemento);
        
        new com.utfpr.crud.CrudPersonal().persist(pers);
    }

    public Collection<Personal> getAll() {
        return new com.utfpr.crud.CrudPersonal().getAll();
    }
}
