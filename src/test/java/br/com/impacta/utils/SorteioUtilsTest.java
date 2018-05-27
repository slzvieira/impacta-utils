package br.com.impacta.utils;

import org.junit.Assert;
import org.junit.Test;

public class SorteioUtilsTest {

    @Test
    public void testSortearCaraCoroa() {
        String result = SorteioUtils.sortearCaraCoroa();
        Assert.assertTrue(result.equals("Cara") || result.equals("Coroa"));
    }

    @Test
    public void testSortearDado() {
        int numero = SorteioUtils.sortearDado();
        Assert.assertTrue(numero > 0 && numero < 7);
    }

    @Test
    public void testSortearMegasena() {

        int[] megasena = SorteioUtils.sortearMegasena();
        Assert.assertEquals(megasena.length, 6);

        for (int i = 0; i < megasena.length; i++) {
            
            Assert.assertTrue(megasena[i] > 0 && megasena[i] < 61);
            
            for (int j = i + 1; j < megasena.length; j++) {
                Assert.assertNotEquals(megasena[i], megasena[j]);
            }
        }
    }
}
