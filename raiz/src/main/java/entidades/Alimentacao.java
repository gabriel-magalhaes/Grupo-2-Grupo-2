/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Marcele
 */
public class Alimentacao {
    public long id;
    public ArrayList<Alimentos> emagrecer;
    public ArrayList<Alimentos> musculo;
    public ArrayList<Alimentos> reeducacao;
    public ArrayList<Alimentos> cardiaco;
    public ArrayList<Alimentos> evitar;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public ArrayList<Alimentos> getEmagrecer() {
        return emagrecer;
    }

    public void setEmagrecer(ArrayList<Alimentos> emagrecer) {
        this.emagrecer = emagrecer;
    }

    public ArrayList<Alimentos> getMusculo() {
        return musculo;
    }

    public void setMusculo(ArrayList<Alimentos> musculo) {
        this.musculo = musculo;
    }

    public ArrayList<Alimentos> getReeducacao() {
        return reeducacao;
    }

    public void setReeducacao(ArrayList<Alimentos> reeducacao) {
        this.reeducacao = reeducacao;
    }

    public ArrayList<Alimentos> getCardiaco() {
        return cardiaco;
    }

    public void setCardiaco(ArrayList<Alimentos> cardiaco) {
        this.cardiaco = cardiaco;
    }

    public ArrayList<Alimentos> getEvitar() {
        return evitar;
    }

    public void setEvitar(ArrayList<Alimentos> evitar) {
        this.evitar = evitar;
    }
    
    
}
