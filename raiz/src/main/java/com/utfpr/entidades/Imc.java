/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.entidades;
/**
 *
 * @author Tamires
 */
public class Imc extends Cliente{

    private long id;
    public double imc;
    public String status;
    
    
    public double calcularImc(Cliente cliente){
        
        String status;
        cliente = new Cliente();
        imc =  (cliente.getPeso()) / (cliente.getAltura() * cliente.getAltura());
        
        return imc;
    }
    
    public String statusImc(Cliente cliente, double imc){
        
        String status = "";
        cliente = new Cliente();
        
        imc = calcularImc(cliente);
        
        if(cliente.getSexo().equals("feminino")){
            /*System.out.printf("\n\nIMC calculado   Situacao");
            System.out.printf("\n------------------------------");
            System.out.printf("\nMenos de 19,1     Abaixo do peso");
            System.out.printf("\n19,1 < IMC < 25,8  Peso Normal");
            System.out.printf("\n25,8 < IMC < 27,3  Marginalmente acima do peso");
            System.out.printf("\n27,3 < IMC < 32,3  Acima do peso ideal");
            System.out.printf("\nAcima de 32,3      Obeso");
            System.out.printf("\n------------------------------");
            System.out.printf("\nIMC = "+imc);*/
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
            
            }else if("masculino".equals(cliente.getSexo())){
                /*System.out.printf("\n\nIMC calculado   Situacao");
                System.out.printf("\n------------------------------");
                System.out.printf("\nMenos de 20,7     Abaixo do peso");
                System.out.printf("\n20,7 < IMC < 26,4  Peso Normal");
                System.out.printf("\n26,4 < IMC < 27,8  Marginalmente acima do peso");
                System.out.printf("\n27,8 < IMC < 31,1  Acima do peso ideal");
                System.out.printf("\nAcima de 31,1      Obeso");
                System.out.printf("\n------------------------------");
                System.out.printf("\nIMC = "+imc);*/  
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
                
                return "Valor não encontrado";
    }
}
