/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import type.TipoAlimento;

/**
 *
 * @author Marcele
 */
public class Alimentos {
    public long id;
    public String nome;
    public TipoAlimento categoria;

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

    public TipoAlimento getCategoria() {
        return categoria;
    }

    public void setCategoria(TipoAlimento categoria) {
        this.categoria = categoria;
    }
    
}
