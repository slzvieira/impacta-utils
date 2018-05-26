/*
 * @(#)TipoCurso.java 1.00 16/05/2018 Copyright 2012 Uniao Impacta S/A.
 * Todos os direitos reservados. IMPACTA PROPRIETARY/CONFIDENTIAL.
 * Proibida a copia e-ou a reproducao deste codigo.
 */
package br.com.impacta.model;

/**
 * TODO DOCUMENT ME
 * 
 * @author sandro.vieira
 * @version 1.0, 16/05/2018 - sandro.vieira - Implementacao.
 */
public enum TipoCurso {

    PRESENCIAL("Presencial"),
    AO_VIVO("Ao Vivo"),
    ONLINE("Online");

    private String descricao;

    TipoCurso(String descricao) {
        this.descricao = descricao;
    }

    public static TipoCurso valueByDescricao(String descricao) {
        if (PRESENCIAL.descricao.equalsIgnoreCase(descricao)) {
            return PRESENCIAL;
        } else if (AO_VIVO.descricao.equalsIgnoreCase(descricao)) {
            return AO_VIVO;
        } else if (ONLINE.descricao.equalsIgnoreCase(descricao)) {
            return ONLINE;
        } else {
            return null;
        }
    }

    public String getDescricao() {
        return descricao;
    }
}
