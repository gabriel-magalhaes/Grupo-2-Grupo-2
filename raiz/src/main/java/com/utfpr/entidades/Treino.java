/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.entidades;

import java.util.ArrayList;

/**
 *
 * @author Heydi Miura Machado
 */
public class Treino {
    public int id;
    public ArrayList<Exercicio> emagrecer;
    public ArrayList<Exercicio> musculo;
    public ArrayList<Exercicio> cardiaco;
    
    public int getId() {
        return id;
    }

    public ArrayList<Exercicio> getEmagrecer() {
        return emagrecer;
    }

    public void setEmagrecer(ArrayList<Exercicio> emagrecer) {
        this.emagrecer = emagrecer;
    }

    public ArrayList<Exercicio> getMusculo() {
        return musculo;
    }

    public void setMusculo(ArrayList<Exercicio> musculo) {
        this.musculo = musculo;
    }

    public ArrayList<Exercicio> getCardiaco() {
        return cardiaco;
    }

    public void setCardiaco(ArrayList<Exercicio> cardiaco) {
        this.cardiaco = cardiaco;
    }
    
    
    

}
