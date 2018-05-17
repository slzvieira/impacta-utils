package br.com.impacta.utils;

import org.junit.Assert;

import java.util.Arrays;

import org.junit.Test;

public class SorteioUtilsTest {

    @Test
    public void test() {
        int[] megasena = SorteioUtils.sortearMegasena();
        System.out.println(Arrays.toString(megasena));
        Assert.assertEquals(megasena.length, 6);
    }
}
