/*
 * @(#)TipoCurso.java 1.00 16/05/2018 Copyright 2012 Uniao Impacta S/A.
 * Todos os direitos reservados. IMPACTA PROPRIETARY/CONFIDENTIAL.
 * Proibida a copia e-ou a reproducao deste codigo.
 */
package br.com.impacta.model;

/**
 * Enumeracao contendo os tipos de cursos disponiveis.
 * 
 * @author sandro.vieira
 * @version 1.0, 16/05/2018 - sandro.vieira - Implementacao.
 */
public enum TipoCurso {

    /**
     * Curso presencial, onde aluno e instrutor comparecem pessoalmente em
     * sala de aula em dias e horarios pre-determinados.
     */
    PRESENCIAL("Presencial"),

    /**
     * Curso ao vivo, onde o instrutor ministra a aula ao vivo e o aluno
     * assiste remotamente pela internet em dias e horarios
     * pre-determinados.
     */
    AO_VIVO("Ao Vivo"),

    /**
     * Curso on line, onde as aulas sao gravadas pelo instrutor e o aluno
     * assiste remotamente quantas vezes quiser, a qualquer momento.
     */
    ONLINE("Online");

    /** Nome do tipo de curso. */
    private String descricao;

    /**
     * Construtor qualificado com a descricao do tipo de curso.
     * @param descricao Descricao (nome) do tipo de curso.
     */
    TipoCurso(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Obtem um dos itens desta enumeracao a partir de sua descricao.
     * @param descricao Descricao do tipo desejado.
     * @return Um tipo de curso.
     */
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

    /**
     * Retorna a descricao do tipo de curso.
     * @return Valor do atributo descricao.
     */
    public String getDescricao() {
        return descricao;
    }
}
