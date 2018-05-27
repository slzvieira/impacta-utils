/*
 * @(#)Noticiario.java 1.00 29/04/2012 Copyright 2012 Uniao Impacta S/A.
 * Todos os direitos reservados. IMPACTA PROPRIETARY/CONFIDENTIAL.
 * Proibida a copia e-ou a reproducao deste codigo.
 */
package br.com.impacta.noticiario;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * <p>Classe utilizada para exibicao de noticias. Utilize o metodo {@link #getNoticia()}
 * para obter uma noticia aleatoria.</p>
 * 
 * <p>Ao instanciar esta classe, pode-se escolher o tipo de noticia a ser gerada:</p>
 * 
 * <p>
 *     <pre>
 *     Noticiario noticiario = new Noticiario(TipoNoticia.ESPORTE);
 *     String noticia = noticiario.getNoticia();
 *     </pre>
 * </p>
 * 
 * @author sandro.vieira
 * 
 * @version 1.0, 29/04/2012 - sandro.vieira - Implementacao.
 * @version 2.0, 16/05/2018 - sandro.vieira - Ajustes de nomenclatura.
 */
public class Noticiario {

	private static final String NOTICIARIO_PROPERTIES = "/properties/noticias.properties";

    /** Lista de noticias a ser carregada durante a instanciacao desta classe. */
    private List<String> noticiaList = new ArrayList<String>();

    /**
     * Carrega as noticias de todos os tipos tornando-as disponiveis para
     * uso pelo metodo {@link #getNoticia()}.
     */
    public Noticiario() {
        try {
            Properties properties = new Properties();
            properties.load(getClass().getResourceAsStream(NOTICIARIO_PROPERTIES));

            for (Object obj : properties.keySet()) {
                noticiaList.add(properties.getProperty((String) obj));
            }
        } catch (IOException ioe) {
            throw new RuntimeException("Falha ao carregar noticias.", ioe);
        }
    }

    /**
     * Carrega as noticias de tipo especificado tornando-as disponiveis para
     * uso pelo metodo {@link #getNoticia()}.
     * 
     * @param tipo Tipo de noticia a ser fornecida por este noticiario.
     */
    public Noticiario(TipoNoticia tipo) {
        try {

            Properties properties = new Properties();
            properties.load(getClass().getResourceAsStream(NOTICIARIO_PROPERTIES));

            String key = null;
            String noticia = null;

            for (Object obj : properties.keySet()) {

                key = (String) obj;
                noticia = properties.getProperty(key);

                if (key.indexOf(tipo.getKey()) != -1) {
                    noticiaList.add(noticia);
                }
            }

        } catch (IOException ioe) {
            throw new RuntimeException("Falha ao carregar noticias.", ioe);
        }
    }

    /**
     * Obtem aleatoriamente uma das noticias carregadas por este noticiario.
     * @return Um noticia aleatoria.
     */
    public String getNoticia() {
        int index = (int) (Math.random() * noticiaList.size());
        return noticiaList.get(index);
    }
}
