/*
 * @(#)TipoNoticia.java 1.00 29/04/2012 Copyright 2012 Uniao Impacta S/A.
 * Todos os direitos reservados. IMPACTA PROPRIETARY/CONFIDENTIAL.
 * Proibida a copia e-ou a reproducao deste codigo.
 */
package br.com.impacta.noticiario;

/**
 * Representa cada uma dos possiveis tipos de noticias a serem
 * carregadas pela classe {@link Noticiario}.
 * 
 * @author sandro.vieira
 * @version 1.0, 29/04/2012 - sandro.vieira - Implementacao.
 */
public enum TipoNoticia {

    /** Categoria de noticias cientificas. */
    CIENCIA("ciencia"),

    /** Categoria de noticias sobre esportes. */
    ESPORTE("esporte"),

    /** Categoria de noticias sobre politica. */
    POLITICA("politica"),

    /** Categoria de noticias sobre tecnologia. */
    TECNOLOGIA("tecnologia");

    /** Chave de identificacao do tipo da noticia. */
    private String key;

    /**
     * Assinala o identificador da noticia.
     * @param key Chave de identificacao do tipo da noticia.
     */
    private TipoNoticia(String key) {
        this.key = key;
    }

    /**
     * Retorna a Chave de identificacao do tipo da noticia.
     * @return Chave de identificacao do tipo da noticia.
     */
    public String getKey() {
        return key;
    }
}
