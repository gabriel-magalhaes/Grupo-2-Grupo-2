/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.web;

import com.utfpr.crud.CrudPersonal;
import com.utfpr.crud.CrudEndereco;
import com.utfpr.entidades.Personal;
import com.utfpr.entidades.Endereco;
import com.utfpr.type.Tipo;
import java.io.Serializable;
import java.util.Collection;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Tamires
 */
@ManagedBean
@ViewScoped
public class JsfPersonal implements Serializable{
    public long id;
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
    public long cep;
    public String pais;
    public String complemento;
    public String senha;
    private String emailOriginal;
    public String pagina;
    public Tipo especialidade;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public long getCep() {
        return cep;
    }

    public void setCep(long cep) {
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmailOriginal() {
        return emailOriginal;
    }

    public void setEmailOriginal(String emailOriginal) {
        this.emailOriginal = emailOriginal;
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

    
    
    @PostConstruct
    public void init() {
        String email = (String)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("email");
        if (email != null) {
            System.out.println(email);
            Personal personal = new CrudPersonal().get(email);
            this.nome = personal.getNome();
            this.email = personal.getEmail();
            this.emailOriginal = personal.getEmail();
            this.senha = personal.getSenha();
            this.nascimentoPersonal = personal.getNascimentoPersonal();
            this.sexo = personal.getSexo();
            this.pagina = personal.getPagina();
            this.especialidade = personal.getEspecialidade();
            this.telefone = personal.getTelefone();
            this.celular = personal.getCelular();
            Endereco endereco = personal.getEnd();
            this.rua = endereco.getRua();
            this.numero = endereco.getNumero();
            this.bairro = endereco.getBairro();
            this.cidade = endereco.getCidade();
            this.cep = endereco.getCep();
            this.complemento = endereco.getComplemento();
            this.estado = endereco.getEstado();
            this.pais = endereco.getPais();
        }
    }

    public String cadastrar() {
        Personal personal = new Personal();
        Endereco endereco = new Endereco();
        personal.setNome(nome);
        personal.setEmail(email);
        personal.setNascimentoPersonal(nascimentoPersonal);
        personal.setSexo(sexo);
        personal.setEspecialidade(especialidade);
        personal.setPagina(pagina);
        personal.setTelefone(telefone);
        personal.setCelular(celular);
        personal.setSenha(senha);
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        endereco.setEstado(estado);
        endereco.setCep(cep);
        endereco.setPais(pais);
        endereco.setComplemento(complemento);
        endereco = new CrudEndereco().persist(endereco);
        personal.setEnd(endereco);
        new CrudPersonal().persist(personal);
        return "principalPersonal";
    }
    
    public String atualizar() {
        Personal personal = new Personal();
        Endereco endereco = new Endereco();
        personal.setNome(nome);
        personal.setEmail(email);
        personal.setNascimentoPersonal(nascimentoPersonal);
        personal.setSexo(sexo);
        personal.setEspecialidade(especialidade);
        personal.setPagina(pagina);
        personal.setTelefone(telefone);
        personal.setCelular(celular);
        personal.setSenha(senha);
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        endereco.setEstado(estado);
        endereco.setCep(cep);
        endereco.setPais(pais);
        endereco.setComplemento(complemento);
        CrudPersonal crudPersonal = new CrudPersonal();
        long endId = crudPersonal.get(emailOriginal).getEnd().id;
        endereco.setId(endId);
        endereco = new CrudEndereco().atualizar(endereco);
        personal.setEnd(endereco);
        crudPersonal.atualizar(personal, emailOriginal);
        return "principalPersonal?faces-redirect=true";
    }

    public String excluir(){
        String email = (String)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("email");
        if (email != null) {
            new CrudPersonal().excluir(email);
            FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        }
        return "index";
    }
    
    public Collection<Personal> getAll() {
        return new com.utfpr.crud.CrudPersonal().getAll();
    }
}
