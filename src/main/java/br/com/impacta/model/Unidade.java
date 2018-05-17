package br.com.impacta.model;

public enum Unidade {

    L("Litro"),
    ML("Mililitro"),
    KG("Quilograma"),
    G("Grama"),
    M("Metro"),
    CM("Centimetro"),
    UN("Unidade");
    
    private String descricao;

    private Unidade(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
