/*
 * @(#)Curso.java 1.00 16/05/2018 Copyright 2012 Uniao Impacta S/A.
 * Todos os direitos reservados. IMPACTA PROPRIETARY/CONFIDENTIAL.
 * Proibida a copia e-ou a reproducao deste codigo.
 */
package br.com.impacta.model;

/**
 * TODO DOCUMENT ME
 * @author sandro.vieira
 * @version 1.0, 16/05/2018 - sandro.vieira - Implementacao.
 */
public class Curso {

	/** Codigo do curso. */
	private int codigo;

	/** Categoria do curso. */
	private String categoria;

	/** Nome do curso. */
	private String nome;

	/** Tipo de curso. */
	private TipoCurso tipoCurso;

	/** Carga horario do curso. */
	private int cargaHoraria;

	/**
	 * Retorna o Codigo do curso.
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Assinala o Codigo do curso.
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * Retorna a Categoria do curso.
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	/**
	 * Assinala a Categoria do curso.
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	/**
	 * Retorna o Nome do curso.
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Assinala o Nome do curso.
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retorn o Tipo de curso. 
	 * @return the tipoCurso
	 */
	public TipoCurso getTipoCurso() {
		return tipoCurso;
	}

	/**
	 * Assinala o Tipo de curso.
	 * @param tipoCurso the tipoCurso to set
	 */
	public void setTipoCurso(TipoCurso tipoCurso) {
		this.tipoCurso = tipoCurso;
	}

	/**
	 * Retorna a Carga horario do curso. 
	 * @return the cargaHoraria
	 */
	public int getCargaHoraria() {
		return cargaHoraria;
	}

	/**
	 * Assinala a Carga horario do curso. 
	 * @param cargaHoraria the cargaHoraria to set
	 */
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
}
