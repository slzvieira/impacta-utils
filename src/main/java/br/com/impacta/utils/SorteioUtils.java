/*
 * @(#)SorteioUtils.java 1.00 29/04/2012 Copyright 2012 Uniao Impacta S/A.
 * Todos os direitos reservados. IMPACTA PROPRIETARY/CONFIDENTIAL.
 * Proibida a copia e-ou a reproducao deste codigo.
 */
package br.com.impacta.utils;

import java.util.Random;

/**
 * Contem metodos utilitarios para sorteio de numeros e outros valores aleatorios.
 * 
 * @author sandro.vieira
 * @version 1.0, 29/04/2012 - sandro.vieira - Implementacao.
 * @version 2.0, 16/05/2018 - sandro.vieira - Metodo {@link #sortearMegasena()} modificado para uso de streams.
 */
public class SorteioUtils {

    /**
     * Inibe a criacao de instancias desta classe.
     */
    private SorteioUtils() {
        // do nothing
    }

    /**
     * Simula o sorteio de cara/coroa a partir de uma moeda.
     * @return "<b><code>Cara</code></b>" ou "<b><code>Coroa</code></b>"
     */
    public static String sortearCaraCoroa() {
        int random = (int) (Math.random() * 2);
        if (random == 0) {
            return "Cara";
        } else {
            return "Coroa";
        }
    }

    /**
     * Simula o sorteio de um dado comum de 6 lados.
     * @return Um numero inteiro entre 1 e 6.
     */
    public static int sortearDado() {
        return (int) (Math.random() * 6) + 1;
    }

    /**
     * Simula o sorteio da Mega Sena.
     * @return Array contendo 6 dezenas aleatorias, ordenadas e nao repetidas entre 1 e 60.
     */
    public static int[] sortearMegasena() {
        return new Random().ints(1, 61)
                           .distinct()
                           .limit(6)
                           .sorted()
                           .toArray();
    }
}
