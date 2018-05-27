/*
 * @(#)Unidade.java 1.00 16/05/2018 Copyright 2012 Uniao Impacta S/A.
 * Todos os direitos reservados. IMPACTA PROPRIETARY/CONFIDENTIAL.
 * Proibida a copia e-ou a reproducao deste codigo.
 */
package br.com.impacta.model;

/**
 * Enumeracao contendo as unidades (metricas) disponiveis.
 * 
 * @author sandro.vieira
 * @version 1.0, 27 de mai de 2018 - sandro.vieira - Implementacao
 */
public enum Unidade {

    /** Unidade Litro. */
    L("Litro"),

    /** Unidade Mililitro. */
    ML("Mililitro"),

    /** Unidade Quilograma. */
    KG("Quilograma"),

    /** Unidade Grama. */
    G("Grama"),

    /** Unidade Metro. */
    M("Metro"),

    /** Unidade Centimetro. */
    CM("Centimetro"),

    /** Unidade Simples (sem metrica). */
    UN("Unidade");
    
    /** Descricao da metrica. */
    private String descricao;

    /**
     * Construtor qualificado com a descricao da metrica.
     * @param descricao Descricao da metrica.
     */
    private Unidade(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Retorna a descricao da unidade.
     * @return Descricao da unidade.
     */
    public String getDescricao() {
        return descricao;
    }
}
