package br.com.impacta.noticiario;

import org.junit.Assert;

import org.junit.Test;

public class NoticiarioTest {

	@Test
	public void testGetNoticia() {
		Noticiario noticiario = new Noticiario();
		String noticia = noticiario.getNoticia();
		System.out.println(noticia);
		Assert.assertNotNull(noticia);
	}
}
