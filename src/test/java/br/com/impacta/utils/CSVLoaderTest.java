package br.com.impacta.utils;

import java.util.List;

import org.junit.Assert;

import org.junit.Test;

import br.com.impacta.model.Curso;
import br.com.impacta.model.Produto;
import br.com.impacta.model.TipoCurso;
import br.com.impacta.model.Unidade;

public class CSVLoaderTest {

    @Test
    public void testLoadCursos() {

        List<Curso> lista = CSVLoader.getInstance().loadCursos();
        Assert.assertEquals(lista.size(), 2);

        Assert.assertEquals(lista.get(0).getCodigo(), 1001);
        Assert.assertEquals(lista.get(0).getCategoria(), "Categoria 1");
        Assert.assertEquals(lista.get(0).getNome(), "Curso 1");
        Assert.assertEquals(lista.get(0).getTipoCurso(), TipoCurso.PRESENCIAL);
        Assert.assertEquals(lista.get(0).getCargaHoraria(), 40);

        Assert.assertEquals(lista.get(1).getCodigo(), 1002);
        Assert.assertEquals(lista.get(1).getCategoria(), "Categoria 2");
        Assert.assertEquals(lista.get(1).getNome(), "Curso 2");
        Assert.assertEquals(lista.get(1).getTipoCurso(), TipoCurso.ONLINE);
        Assert.assertEquals(lista.get(1).getCargaHoraria(), 60);
    }

    @Test
    public void testLoadProdutos() {

        List<Produto>lista = CSVLoader.getInstance().loadProdutos();
        Assert.assertEquals(lista.size(), 2);

        Assert.assertEquals(lista.get(0).getId(), 1000);
        Assert.assertEquals(lista.get(0).getNome(), "Produto 1");
        Assert.assertEquals(lista.get(0).getCategoria(), "Categoria 1");
        Assert.assertEquals(lista.get(0).getPreco(), 1234.56, 0);
        Assert.assertEquals(lista.get(0).getTamanho(), 400, 0);
        Assert.assertEquals(lista.get(0).getUnidade(), Unidade.G);
        Assert.assertEquals(lista.get(1).getId(), 2000);
        Assert.assertEquals(lista.get(1).getNome(), "Produto 2");
        Assert.assertEquals(lista.get(1).getCategoria(), "Categoria 2");
        Assert.assertEquals(lista.get(1).getPreco(), 1, 0);
        Assert.assertEquals(lista.get(1).getTamanho(), 3.7, 0);
        Assert.assertEquals(lista.get(1).getUnidade(), Unidade.KG);
    }
}
