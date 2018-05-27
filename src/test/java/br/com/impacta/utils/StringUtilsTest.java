package br.com.impacta.utils;

import org.junit.Assert;

import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void testInverter() {
        Assert.assertEquals(StringUtils.inverter("abcdefghij"), "jihgfedcba");
    }

    @Test
    public void testRepetir() {
        Assert.assertEquals(StringUtils.repetir("abc", 5), "abcabcabcabcabc");
    }

    @Test
    public void testJuntar() {
        Object[] array = { "texto1", "texto2", "texto3" };
        Assert.assertEquals(StringUtils.juntar(array), "texto1,texto2,texto3");
    }

    @Test
    public void testJuntarComSeparador() {
        Object[] array = { "texto1", "texto2", "texto3" };
        Assert.assertEquals(StringUtils.juntar("; ", array), "texto1; texto2; texto3");
    }
}
