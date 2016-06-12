package com.utfpr.entidades;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by laisa on 12/06/2016.
 */
public class ClienteTest {

    @Test
    public void testCalcularIdade() throws Exception {

        Date aposAniversario = criarData(1990, 6, 10);
        Date atualFalsa = criarData(2016, 6, 12);
        Date antesAniversario = criarData(1990, 6, 14);
        Cliente cliente = new Cliente();

        assertEquals("A idade calculada deveria ser 26 anos", 26, cliente.calcularIdade(aposAniversario, atualFalsa));
        assertEquals("A idade calculada deveria ser 25 anos", 25, cliente.calcularIdade(antesAniversario, atualFalsa));

    }

    private Date criarData(int ano, int mes, int dia) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, ano);
        cal.set(Calendar.MONTH, mes);
        cal.set(Calendar.DAY_OF_MONTH, dia);
        return cal.getTime();
    }
}