/*
 * @(#)Produto.java 1.00 16/05/2018 Copyright 2012 Uniao Impacta S/A.
 * Todos os direitos reservados. IMPACTA PROPRIETARY/CONFIDENTIAL.
 * Proibida a copia e-ou a reproducao deste codigo.
 */
package br.com.impacta.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Retem as informacoes de um produto.
 * @author sandro.vieira
 * @version 1.0, 27/05/2018 - sandro.vieira - Implementacao.
 */
public final class Produto {

    /** ID do produto. */
    private int id;

    /** Nome do produto. */
    private String nome;

    /** Categoria do produto. */
    private String categoria;

    /** Lista das cores disponiveis do produto. */
    private List<Color> coresDisponiveis;

    /** Preco do produto. */
    private double preco;

    /** Tamanho do produto. */
    private double tamanho;

    /** Unidade de medida do produto (litro, metro, quilograma, etc) */
    private Unidade unidade;

    /**
     * Construtor padrao.
     * Instancia um produto com atributos vazios.
     */
    public Produto() {
        this(0, null, null, 0.0);
    }

    /**
     * Construtor qualificado com o ID do produto.
     * @param id ID do produto.
     */
    public Produto(int id) {
        this(id, null, null, 0.0);
    }

    /**
     * Construtor qualificado com os principais atributos do produto.
     * 
     * @param id ID do produto.
     * @param nome Nome do pruduto.
     * @param categoria Categoria do produto.
     * @param preco Preco do produto.
     */
    public Produto(int id, String nome, String categoria, double preco) {
        this(id, nome, categoria, preco, 0, null);
    }

    /**
     * Construtor qualificado com os atributos mais comuns do produto.
     * 
     * @param id ID do produto.
     * @param nome Nome do produto.
     * @param categoria Categoria do produto.
     * @param preco Preco do produto.
     * @param tamanho Tamanho do produto.
     * @param unidade Unidade do produto.
     */
    public Produto(int id, String nome, String categoria, double preco, double tamanho, Unidade unidade) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.tamanho = tamanho;
        this.unidade = unidade;
    }
    
    /**
     * Retorna o ID do produto.
     * @return Atributo id.
     */
    public int getId() {
        return id;
    }

    /**
     * Assinala o ID do produto.
     * @param id ID do produto.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retorna o nome do produto.
     * @return Nome do produto.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Assinala o nome do produto.
     * @param nome Nome do produto.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a categoria do produto.
     * @return Categoria do produto.
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Assinala a categoria do produto.
     * @param categoria Categoria do produto.
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Retorna o preco do produto.
     * @return Preco do produto.
     */
    public double getPreco() {
        return preco;
    }

    /**
     * Assinala o preco do produto.
     * @param preco Preco do produto.
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Retorna o tamanho do produto.
     * @return Tamanho do produto.
     */
    public double getTamanho() {
        return tamanho;
    }

    /**
     * Assinala o tamanho do produto.
     * @param size Tamanho do produto.
     */
    public void setTamanho(double size) {
        this.tamanho = size;
    }

    /**
     * Retorna a unidade do produto.
     * @return Unidade do produto.
     */
    public Unidade getUnidade() {
        return unidade;
    }

    /**
     * Assinala a unidade do produto.
     * @param unidade Unidade do produto.
     */
    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }
    
    /**
     * Retorna a quantidade de cores disponiveis para o produto.
     * @return Tamanho da lista de cores, 0 quando nao ha cores.
     */
    public int getCoresDisponiveis() {
        return coresDisponiveis == null ? 0 : coresDisponiveis.size();
    }

    /**
     * Retorna uma das cores disponiveis para o produto.
     * @param i Indice da cor contida na lista de cores.
     * @return Uma das cores disponiveis, conforme o indice especificado. null quando o indice nao existe.
     */
    public Color getCorDisponivel(int i) {
        return coresDisponiveis == null || coresDisponiveis.size() <= i ? null : coresDisponiveis.get(i);
    }

    /**
     * Adicionar uma cor a lista de cores disponiveis.
     * @param color Cor a ser adicionada.
     */
    public void addCorDisponive(Color color) {
        if (coresDisponiveis == null) {
            coresDisponiveis = new ArrayList<>();
        }
        coresDisponiveis.add(color);
    }

    /**
     * Descricao do produto.
     * @return Texto no formato [id=2009; nome="Produto X"; categoria="Categoria X"; preco=23,67]
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return String.format("[id=%d; nome=\"%s\"; categoria=\"%s\"; preco=%,.2f]", id, nome, categoria, preco);
    }
}
