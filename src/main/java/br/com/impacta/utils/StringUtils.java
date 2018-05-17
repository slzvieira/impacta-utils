/*
 * @(#)StringUtils.java 1.00 29/04/2012 Copyright 2012 Uniao Impacta S/A.
 * Todos os direitos reservados. IMPACTA PROPRIETARY/CONFIDENTIAL.
 * Proibida a copia e-ou a reproducao deste codigo.
 */
package br.com.impacta.utils;

/**
 * Contem metodos utilitarios para manipulacao de Strings.
 * 
 * @author sandro.vieira
 * @version 1.0, 29/04/2012 - sandro.vieira - Implementacao.
 */
public class StringUtils {

    /**
     * Inibe a criacao de instancias.
     */
    private StringUtils() {
        // do nothing
    }

    /**
     * Inverte um String.
     * @param texto Texto a ser invertido.
     * @return String contendo os caracteres na ordem contraria.
     */
    public static String inverter(String texto) {
    	return new StringBuilder(texto).reverse().toString();
    }

    /**
     * Repete o string especificado.
     * 
     * @param texto String a ser repetido.
     * @param quantidade Quantidade de vezes a repetir o String.
     * 
     * @return String contendo o texto especificado diversas vezes.
     */
    public static String repetir(String texto, int quantidade) {
        if (quantidade < 0) {
            throw new RuntimeException("Quantidade nao pode ser negativo.");
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < quantidade; i++) {
            builder.append(texto);
        }
        return builder.toString();
    }

    /**
     * Monta um String contendo todos os valores especificados separados por "," (virgula).
     * @param valores Valores a serem ajuntados em um unico String.
     * @return Concatenacao de todos os valores especificados separados por "," (virgula).
     */
    public static String juntar(Object[] valores) {
        return juntar(",", valores);
    }

    /**
     * Monta um String contendo todos os valores especificados separados pelo caracter desejado.
     * @param separador Trecho de string a ser utilizado como separados.
     * @param valores Valores a serem ajuntados em um unico String.
     * @return Concatenacao de todos os valores especificados separados pelo caracter desejado.
     */
    public static String juntar(String separador, Object[] valores) {
        if (valores == null || valores.length == 0) {
            return "";
        }
        StringBuilder builder = new StringBuilder(valores[0].toString());
        for (int i = 1; i < valores.length; i++) {
            builder.append(separador);
            builder.append(valores[i]);
        }
        return builder.toString();
    }
}
