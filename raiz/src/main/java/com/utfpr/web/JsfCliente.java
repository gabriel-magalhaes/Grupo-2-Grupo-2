package com.utfpr.web;

import com.utfpr.crud.CrudCliente;
import com.utfpr.crud.CrudEndereco;
import com.utfpr.entidades.Cliente;
import com.utfpr.entidades.Endereco;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * Created by laisa on 26/06/2016.
 */ 
@ManagedBean
@ViewScoped
public class JsfCliente implements Serializable{
    public long id;
    public String nome;
    public String email;
    public String sexo;
    public String telefone;
    public String celular;
    public Date nascimento;
    public String rua;
    public int numero;
    public String bairro;
    public String cidade;
    public String estado;
    public long cep;
    public String pais;
    public String complemento;
    private float altura;
    private float peso;
    public String senha;
    private String emailOriginal;
    private double imc;
    protected int sex;
    protected double percentual;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

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

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
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

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getEmailOriginal() {
        return emailOriginal;
    }

    public void setEmailOriginal(String emailOriginal) {
        this.emailOriginal = emailOriginal;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }
    
    

    @PostConstruct
    public void init() {
        String email = (String)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("email");
        if (email != null) {
            System.out.println(email);
            Cliente cliente = new CrudCliente().get(email);
            this.nome = cliente.getNome();
            this.email = cliente.getEmail();
            this.emailOriginal = cliente.getEmail();
            this.senha = cliente.getSenha();
            this.nascimento = cliente.getNascimento();
            this.sexo = cliente.getSexo();
            this.altura = cliente.getAltura();
            this.peso = cliente.getPeso();
            this.telefone = cliente.getTelefone();
            this.celular = cliente.getCelular();
            Endereco endereco = cliente.getEnd();
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
        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();
        cliente.setNome(nome);
        cliente.setEmail(email);
        cliente.setNascimento(nascimento);
        cliente.setSexo(sexo);
        cliente.setAltura(altura);
        cliente.setPeso(peso);
        cliente.setTelefone(telefone);
        cliente.setCelular(celular);
        cliente.setSenha(senha);
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        endereco.setEstado(estado);
        endereco.setCep(cep);
        endereco.setPais(pais);
        endereco.setComplemento(complemento);
        endereco = new CrudEndereco().persist(endereco);
        cliente.setEnd(endereco);
        new CrudCliente().persist(cliente);
        return "calculoCardiaco";
    }
    public String atualizar() {
        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();
        cliente.setNome(nome);
        cliente.setEmail(email);
        cliente.setNascimento(nascimento);
        cliente.setSexo(sexo);
        cliente.setAltura(altura);
        cliente.setPeso(peso);
        cliente.setTelefone(telefone);
        cliente.setCelular(celular);
        cliente.setSenha(senha);
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        endereco.setEstado(estado);
        endereco.setCep(cep);
        endereco.setPais(pais);
        endereco.setComplemento(complemento);
        CrudCliente crudCliente = new CrudCliente();
        long endId = crudCliente.get(emailOriginal).getEnd().id;
        endereco.setId(endId);
        endereco = new CrudEndereco().atualizar(endereco);
        cliente.setEnd(endereco);
        crudCliente.atualizar(cliente, emailOriginal);
        return "principalCliente?faces-redirect=true";
    }

    public String excluir(){
        String email = (String)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("email");
        if (email != null) {
            new CrudCliente().excluir(email);
            FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        }
        return "index";
    }
    
    public double calcularImc(Cliente cliente){
        
        cliente = new Cliente();
        imc = (double)this.getImc();
        imc =  (this.getPeso()) / (this.getAltura() * this.getAltura());
        return imc;
    }
    
      public String statusImc(Cliente cliente){
        
        cliente = new Cliente();
        
        if("feminino".equals(this.getSexo())){
            
            if (imc < 19.1){
                return "Abaixo do peso";
            }else if ((imc > 19.1) && (imc < 25.8)){
                 return "Peso normal";
                }else if ((imc > 25.8) && (imc < 27.3)){
                      return "Marginalmente acima do peso";
                    }else if ((imc > 27.3) && (imc < 32.3)){
                           return "Acima do peso ideal";
                        }else
                            return "Obeso";
            
            }else if("masculino".equals(this.getSexo())){
           
                if (imc < 20.7){
                    return "Abaixo do peso";
                }else if ((imc > 20.7) && (imc < 26.4)){
                     return "Peso normal";
                    }else if ((imc > 26.4) && (imc < 27.8)){
                          return "Marginalmente acima do peso";
                        }else if ((imc > 27.8) && (imc < 31.1)){
                               return "Acima do peso ideal";
                            }else
                                return "Obeso";
                }
                
                return "Valor nao encontrado";
        }
    
      public double calcularPercentualGordura(Cliente cliente){
        cliente = new Cliente();
        int idade = cliente.calcularIdade(this.nascimento, new Date());
        
        
        if("feminino".equals(this.getSexo())){
            sex = 0;
        } else if("masculino".equals(this.getSexo())){
            sex = 1;
        } 
        
        percentual = (((1.20 * this.getImc()) + (0.23 * idade) - (10.8 * sex)))-5.4;
        //status = statusGordura(cliente.getIdade(),percentual, sexo);
        return percentual;
    }
}
