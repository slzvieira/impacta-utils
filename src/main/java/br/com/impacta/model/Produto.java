package br.com.impacta.model;

import java.util.ArrayList;
import java.util.List;

public final class Produto {

    private int id;
    private String nome;
    private String categoria;
    private List<Color> coresDisponiveis;
    private double preco;
    private double tamanho;
    private Unidade unidade;

    public Produto() {
        this(0, null, null, 0.0);
    }

    public Produto(int id) {
        this(id, null, null, 0.0);
    }

    public Produto(int id, String nome, String categoria, double preco) {
        this(id, nome, categoria, preco, 0, null);
    }

    public Produto(int id, String nome, String categoria, double preco, double tamanho, Unidade unidade) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.tamanho = tamanho;
        this.unidade = unidade;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setIdNomeCategoria(int id, String nome, String categoria) {
        this.id = id ;
        this.nome = nome;
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double size) {
        this.tamanho = size;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }
    
    public int getCoresDisponiveis() {
        return coresDisponiveis == null ? 0 : coresDisponiveis.size();
    }

    public Color getCorDisponivel(int i) {
        return coresDisponiveis == null || coresDisponiveis.size() <= i ? null : coresDisponiveis.get(i);
    }

    public void addCorDisponive(Color color) {
        if (coresDisponiveis == null) {
            coresDisponiveis = new ArrayList<>();
        }
        coresDisponiveis.add(color);
    }

    public String toString() {
        return String.format("[id=%d; nome=\"%s\"; categoria=\"%s\"; preco=%,.2f]", id, nome, categoria, preco);
    }
}
