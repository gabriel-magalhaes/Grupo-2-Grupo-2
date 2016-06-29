/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.entidades;

import com.utfpr.type.Tipo;
import javax.persistence.Entity;

/**
 *
 * @author Tamires
 */
@Entity
public class Personal extends Pessoa {
    
    
//    private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
    private Tipo especialidade;
    private String pagina;
//    public String nome;
//    public String email;
//    public String sexo;
//    public String telefone;
//    public String celular;
//    public String nascimentoPersonal;
//    public String rua;
//    public int numero;
//    public String bairro;
//    public String cidade;
//    public String estado;
//    public int cep;
//    public String pais;
//    public String complemento;

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

}
