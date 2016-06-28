/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.entidades;

/**
 *
 * @author Heydi
 */

public class CalculoBasal extends Cliente {

    private Long id;

    public double calculoBasal(Cliente cliente) {
        cliente = new Cliente();
        double basal=0;
        if ("feminino".equals(cliente.getSexo())) {
            basal = 66.47 + (13.75 * cliente.getPeso()) + (5 * cliente.getAltura()) - (6.76 * cliente.getIdade());
            
        } else if ("masculino".equals(cliente.getSexo())) {
            basal = 655.1 + (9.56 * cliente.getPeso()) + (1.85 * cliente.getAltura()) - (4.67 * cliente.getIdade());
           
        }
        return basal;
    }
}
