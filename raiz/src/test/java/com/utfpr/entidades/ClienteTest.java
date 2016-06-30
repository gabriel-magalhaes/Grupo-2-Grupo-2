package com.utfpr.entidades;

import org.junit.Test;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
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

    @Test
    public void testCalcularImc() throws Exception {
        Cliente cliente = new Cliente();
        cliente.setAltura((float) 1.74);
        cliente.setPeso((float) 60.0);
        cliente.calcularImc();
        double resultado = arredondarDuasCasas(cliente.getImc());
        assertEquals(19.81, resultado, 0.1);

        cliente.setPeso((float) 80.0);
        cliente.calcularImc();
        resultado = arredondarDuasCasas(cliente.getImc());
        assertEquals(26.42, resultado, 0.1);
    }

    @Test
    public void testGetStatusImc() throws Exception {
        Cliente cliente = new Cliente();
        cliente.setAltura((float) 1.74);
        cliente.setPeso((float) 60.0);
        cliente.setSexo("masculino");
        cliente.calcularImc();
        assertEquals("Abaixo do peso", cliente.getStatusImc());

        cliente.setPeso((float) 80.0);
        cliente.calcularImc();
        assertEquals("Marginalmente acima do peso", cliente.getStatusImc());
    }

    @Test
    public void testCalcularBasal() throws Exception {
        Cliente cliente = new Cliente();
        cliente.setAltura((float) 1.74);
        cliente.setPeso((float) 60.0);
        cliente.setSexo("masculino");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = sdf.parse("08/06/1985");
        cliente.setNascimento(d);
        cliente.calcularBasal();
        double resultado = arredondarDuasCasas(cliente.getBasal());
        assertEquals(1087.14, resultado, 0.1);

        cliente.setPeso((float) 80.0);
        cliente.calcularBasal();
        resultado = arredondarDuasCasas(cliente.getBasal());
        assertEquals(1278.34, resultado, 0.1);
    }

    @Test
    public void testCalcularPercentualGordura() throws Exception {
        Cliente cliente = new Cliente();
        cliente.setAltura((float) 1.74);
        cliente.setPeso((float) 60.0);
        cliente.setSexo("masculino");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = sdf.parse("08/06/1985");
        cliente.setNascimento(d);
        cliente.calcularImc();
        cliente.calcularPercentualGordura();
        double resultado = arredondarDuasCasas(cliente.getPercentual());
        assertEquals(14.71, resultado, 0.1);

        cliente.setPeso((float) 80.0);
        cliente.calcularImc();
        cliente.calcularPercentualGordura();
        resultado = arredondarDuasCasas(cliente.getPercentual());
        assertEquals(22.63, resultado, 0.1);
    }

    private Date criarData(int ano, int mes, int dia) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, ano);
        cal.set(Calendar.MONTH, mes);
        cal.set(Calendar.DAY_OF_MONTH, dia);
        return cal.getTime();
    }

    private double arredondarDuasCasas(double f) {
        DecimalFormat df = new DecimalFormat("#.##");
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setDecimalSeparator('.');
        df.setDecimalFormatSymbols(dfs);
        return Double.valueOf(df.format(f));
    }
}
