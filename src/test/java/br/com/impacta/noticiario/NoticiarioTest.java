package br.com.impacta.noticiario;

import org.junit.Assert;

import org.junit.Test;

public class NoticiarioTest {

    private static final String NOTICIA_CIENCIA = "Noticia Ciencia";
    private static final String NOTICIA_ESPORTE = "Noticia Esporte";
    private static final String NOTICIA_POLITICA = "Noticia Politica";
    private static final String NOTICIA_TECNOLOGIA = "Noticia Tecnologia";

    @Test
    public void testGetNoticiaCiencia() {
        Noticiario noticiario = new Noticiario(TipoNoticia.CIENCIA);
        String noticia = noticiario.getNoticia();
        Assert.assertEquals(noticia, NOTICIA_CIENCIA);
    }

    @Test
    public void testGetNoticiaEsporte() {
        Noticiario noticiario = new Noticiario(TipoNoticia.ESPORTE);
        String noticia = noticiario.getNoticia();
        Assert.assertEquals(noticia, NOTICIA_ESPORTE);
    }

    @Test
    public void testGetNoticiaPolitica() {
        Noticiario noticiario = new Noticiario(TipoNoticia.POLITICA);
        String noticia = noticiario.getNoticia();
        Assert.assertEquals(noticia, NOTICIA_POLITICA);
    }

    @Test
    public void testGetNoticiaTecnologia() {
        Noticiario noticiario = new Noticiario(TipoNoticia.TECNOLOGIA);
        String noticia = noticiario.getNoticia();
        Assert.assertEquals(noticia, NOTICIA_TECNOLOGIA);
    }

    @Test
    public void testGetNoticia() {
        Noticiario noticiario = new Noticiario();
        String noticia = noticiario.getNoticia();
        Assert.assertTrue(
            noticia.equals(NOTICIA_CIENCIA) ||
            noticia.equals(NOTICIA_ESPORTE) ||
            noticia.equals(NOTICIA_POLITICA) ||
            noticia.equals(NOTICIA_TECNOLOGIA));
    }
}
