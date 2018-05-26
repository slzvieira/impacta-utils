package br.com.impacta.utils;

import org.junit.Assert;

import org.junit.Test;

public class CSVLoaderTest {

    @Test
    public void testLoadCursos() {
        CSVLoader.getInstance().loadCursos().forEach(System.out::println);
    }

    @Test
    public void testLoadProdutos() {
        CSVLoader.getInstance().loadProdutos().forEach(System.out::println);
    }
}
