/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utfpr.entidades;
/**
 *
 * @author Marcele
 */
public class PercentualGordura extends Cliente {

    private long id;
    
    public double calcularPercentualGordura(Cliente cliente){
        cliente = new Cliente();
        double percentual;
        int sexo = 0;
        String status = "";
        if("feminino".equals(cliente.getSexo())){
            sexo = 0;
        } else if("masculino".equals(cliente.getSexo())){
            sexo = 1;
        } 
        
        percentual = ((1.20 * cliente.getImc()) + (0.23 * cliente.getIdade()) - (10.8 * sexo));
        //status = statusGordura(cliente.getIdade(),percentual, sexo);
        return percentual;
    }
    
    public String statusGordura(int idade, double percentual, int sexo){
        
         /*              SEXO FEMININO               */
        if(sexo == 0){
          if(idade>=20 && idade<=29){
              if (percentual < 5.2){
                  return "MUITO MAGRO";
              }
              else if(percentual>= 5.3 && percentual <=9.3){
                  return "MAGRO";
              }
              else if(percentual>= 9.4 && percentual <=14.01){
                  return "MUITO BOM";
              }
              else if(percentual>= 14.02 && percentual <=17.5){
                  return "SAUDÁVEL";
              }
              else if(percentual>= 17.6 && percentual <=22.4){
                  return "SOBREPESO";
              }
              else if(percentual>=22.5 && percentual <=29.2){
                  return "GORDO";
              }
              else if(percentual>= 29.3){
                  return "MUITO GORDO";
              }
          }else if(idade>=30 && idade<=39){
              if (percentual < 9.2){
                  return "MUITO MAGRO";
              }
              else if(percentual>= 9.3 && percentual <=14.0){
                  return "MAGRO";
              }
              else if(percentual>=14.1 && percentual <=17.5){
                  return "MUITO BOM";
              }
              else if(percentual>=17.6 && percentual <=20.6){
                  return "SAUDÁVEL";
              }
              else if(percentual>=20.7 && percentual <=24.2){
                  return "SOBREPESO";
              }
              else if(percentual>=24.3 && percentual <=30.0){
                  return "GORDO";
              }
              else if(percentual>= 30.1){
                  return "MUITO GORDO";
              }
              
          }else if(idade>=40 && idade<=49){
              if (percentual < 11.5){
                  return "MUITO MAGRO";
              }
              else if(percentual>= 11.6 && percentual <=16.3){
                  return "MAGRO";
              }
              else if(percentual>=16.4 && percentual <=19.6){
                  return "MUITO BOM";
              }
              else if(percentual>=19.7 && percentual <=22.5){
                  return "SAUDÁVEL";
              }
              else if(percentual>=22.6 && percentual <=26.2){
                  return "SOBREPESO";
              }
              else if(percentual>=26.3 && percentual <=31.4){
                  return "GORDO";
              }
              else if(percentual>= 31.5){
                  return "MUITO GORDO";
              }
              
          }else if(idade>=50 && idade<=59){
              if (percentual < 12.9){
                  return "MUITO MAGRO";
              }
              else if(percentual>= 13.0 && percentual <=18.1){
                  return "MAGRO";
              }
              else if(percentual>=18.2 && percentual <=21.2){
                  return "MUITO BOM";
              }
              else if(percentual>=21.3 && percentual <=24.2){
                  return "SAUDÁVEL";
              }
              else if(percentual>=24.3 && percentual <=27.6){
                  return "SOBREPESO";
              }
              else if(percentual>=27.7 && percentual <=32.4){
                  return "GORDO";
              }
              else if(percentual>= 32.5){
                  return "MUITO GORDO";
              }
              
          }else if(idade>60){
              if (percentual < 13.0){
                  return "MUITO MAGRO";
              }
              else if(percentual>= 13.1 && percentual <=18.5){
                  return "MAGRO";
              }
              else if(percentual>=18.6 && percentual <=22.0){
                  return "MUITO BOM";
              }
              else if(percentual>=22.1 && percentual <=25.0){
                  return "SAUDÁVEL";
              }
              else if(percentual>=25.1 && percentual <=28.4){
                  return "SOBREPESO";
              }
              else if(percentual>=28.5 && percentual <=33.5){
                  return "GORDO";
              }
              else if(percentual>= 33.6){
                  return "MUITO GORDO";
              }
              
          }     
        }
        
        
        
        
        /*              SEXO MASCULINO               */
        if(sexo == 1){
            if(idade>=20 && idade<=29){
              if (percentual < 10.7){
                  return "MUITO MAGRO";
              }
              else if(percentual>= 10.8 && percentual <=17.0){
                  return "MAGRO";
              }
              else if(percentual>= 17.1 && percentual <=20.5){
                  return "MUITO BOM";
              }
              else if(percentual>= 20.6 && percentual <=23.8){
                  return "SAUDÁVEL";
              }
              else if(percentual>= 23.9 && percentual <=27.6){
                  return "SOBREPESO";
              }
              else if(percentual>=27.7 && percentual <=35.5){
                  return "GORDO";
              }
              else if(percentual>= 35.6){
                  return "MUITO GORDO";
              }
          }else if(idade>=30 && idade<=39){
              if (percentual < 13.3){
                  return "MUITO MAGRO";
              }
              else if(percentual>=13.4 && percentual <=18.0){
                  return "MAGRO";
              }
              else if(percentual>=18.1 && percentual <=21.8){
                  return "MUITO BOM";
              }
              else if(percentual>=21.9 && percentual <=24.8){
                  return "SAUDÁVEL";
              }
              else if(percentual>=24.9 && percentual <=30.0){
                  return "SOBREPESO";
              }
              else if(percentual>=30.1 && percentual <=35.8){
                  return "GORDO";
              }
              else if(percentual>= 35.9){
                  return "MUITO GORDO";
              }
              
          }else if(idade>=40 && idade<=49){
              if (percentual < 16.1){
                  return "MUITO MAGRO";
              }
              else if(percentual>= 16.2 && percentual <=21.4){
                  return "MAGRO";
              }
              else if(percentual>=21.5 && percentual <=25.1){
                  return "MUITO BOM";
              }
              else if(percentual>=25.2 && percentual <=28.3){
                  return "SAUDÁVEL";
              }
              else if(percentual>=28.4 && percentual <=32.1){
                  return "SOBREPESO";
              }
              else if(percentual>=32.2 && percentual <=37.7){
                  return "GORDO";
              }
              else if(percentual>= 37.8){
                  return "MUITO GORDO";
              }
              
          }else if(idade>=50 && idade<=59){
              if (percentual < 18.8){
                  return "MUITO MAGRO";
              }
              else if(percentual>= 18.9 && percentual <=25.1){
                  return "MAGRO";
              }
              else if(percentual>=25.2 && percentual <=28.6){
                  return "MUITO BOM";
              }
              else if(percentual>=28.7 && percentual <=32.5){
                  return "SAUDÁVEL";
              }
              else if(percentual>=32.6 && percentual <=35.6){
                  return "SOBREPESO";
              }
              else if(percentual>=35.7 && percentual <=39.6){
                  return "GORDO";
              }
              else if(percentual>= 39.7){
                  return "MUITO GORDO";
              }
              
          }else if(idade>60){
              if (percentual < 19.1){
                  return "MUITO MAGRO";
              }
              else if(percentual>= 19.2 && percentual <=25.0){
                  return "MAGRO";
              }
              else if(percentual>=25.1 && percentual <=29.5){
                  return "MUITO BOM";
              }
              else if(percentual>=29.6 && percentual <=32.8){
                  return "SAUDÁVEL";
              }
              else if(percentual>=32.9 && percentual <=36.7){
                  return "SOBREPESO";
              }
              else if(percentual>=36.8 && percentual <=40.4){
                  return "GORDO";
              }
              else if(percentual>= 40.5){
                  return "MUITO GORDO";
              }
              
          }     
        }
        return " ";
    }
 

}
