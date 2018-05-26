/*
 * @(#)CSVLoader.java 1.00 16/05/2018 Copyright 2012 Uniao Impacta S/A.
 * Todos os direitos reservados. IMPACTA PROPRIETARY/CONFIDENTIAL.
 * Proibida a copia e-ou a reproducao deste codigo.
 */
package br.com.impacta.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import br.com.impacta.model.Curso;
import br.com.impacta.model.Produto;
import br.com.impacta.model.TipoCurso;
import br.com.impacta.model.Unidade;

/**
 * Classe utilitaria a ser usada para carregar dados de Cursos ou Produtos
 * provenientes de arquivos CSV.
 * 
 * @author sandro.vieira
 * @version 1.0, 16/05/2018 - sandro.vieira - Implementacao.
 */
public class CSVLoader {

    /** Caminho default do arquivo de cursos. */
    private static final String LISTA_CURSOS_RESOURCE = "/lista-cursos.csv";

    /** Caminho default do arquivo de produtos. */
    private static final String LISTA_PRODUTOS_RESOURCE = "/lista-produtos.csv";

    /**
     * Formato do preco dos produtos. Todos os precos contidos no arquivo CSV devem seguir este formato.
     * Exemplos:
     * <pre>
     *     120,8    23,8    15,75    189,67
     * </pre>
     */
    private static final DecimalFormat FORMATO_PRECO = new DecimalFormat("#.#");

    /** Instancia singleton desta classe. */
    private static final CSVLoader INSTANCE = new CSVLoader();

    /**
     * Obtem a instancia singleton (unica) desta classe.
     * @return
     */
    public static CSVLoader getInstance() {
        return INSTANCE;
    }

    /**
     * Construtor padrao. Privado para impedir a instanciacao desta classe.
     */
    private CSVLoader() {
        // do nothing
    }

    /**
     * Carrega os cursos contidos no arquivo padrao desta biblioteca.
     * @return Lista padrao de cursos
     */
    public List<Curso> loadCursos() {
        return loadCursos(null);
    }

    /**
     * Carrega os cursos contidos no arquivo especificado.
     * @param filePath Caminho fisico do arquivo CSV contendo os cursos a serem carregados.
     *        Em caso de nulo, carrega aqueles do arquivo default.
     * @return Lista de cursos
     */
    public List<Curso> loadCursos(String filePath) {

        List<Curso> cursoLista = new ArrayList<>();
        Curso curso;

        try {

            BufferedReader reader = null;

            if (filePath == null) {
                reader = new BufferedReader(
                        new InputStreamReader(getClass().getResourceAsStream(LISTA_CURSOS_RESOURCE)));
            } else {
                reader = new BufferedReader(new FileReader(filePath));
            }

            while (reader.ready()) {
                curso = parseCurso(reader.readLine());
                cursoLista.add(curso);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return cursoLista;
    }

    /**
     * Carrega os produtos contidos no arquivo padrao desta biblioteca.
     * @return Lista padrao de produtos
     */
    public List<Produto> loadProdutos() {
        return loadProdutos(null);
    }

    /**
     * Carrega os produtos contidos no arquivo especificado.
     * @param filePath Caminho fisico do arquivo CSV contendo os produtos a serem carregados.
     *        Em caso de nulo, carrega aqueles do arquivo default.
     * @return Lista de produtos
     */
    public List<Produto> loadProdutos(String filePath) {

        List<Produto> productList = new ArrayList<>();
        Produto produto;

        try {
            BufferedReader reader = null;

            if (filePath == null) {
                reader = new BufferedReader(
                        new InputStreamReader(getClass().getResourceAsStream(LISTA_PRODUTOS_RESOURCE)));
            } else {
                reader = new BufferedReader(new FileReader(filePath));
            }

            while (reader.ready()) {
                produto = parseProduto(reader.readLine());
                productList.add(produto);
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return productList;
    }

    /**
     * Converte uma das linhas lidas do arquivo CSV em um Curso.
     * @param line Linha de texto a ser convertida
     * @return Curso contendo os dados parseados
     */
    private Curso parseCurso(String line) {

        String[] data = line.split(";");
        Curso curso = new Curso();

        curso.setCodigo(Integer.parseInt(data[0]));
        curso.setCategoria(data[1]);
        curso.setNome(data[2]);
        curso.setTipoCurso(TipoCurso.valueByDescricao(data[3]));
        curso.setCargaHoraria(Integer.parseInt(data[4]));

        return curso;
    }

    /**
     * Converte uma das linhas lidas do arquivo CSV em um Produto.
     * @param line Linha de texto a ser convertida
     * @return Produto contendo os dados parseados
     * @throws ParseException Preco ou tamanho invalidos
     */
    private Produto parseProduto(String line) throws ParseException {

        String[] data = line.split(";");
        Produto produto = new Produto();

        produto.setId(Integer.parseInt(data[0]));
        produto.setNome(data[1]);
        produto.setCategoria(data[2]);
        produto.setPreco(FORMATO_PRECO.parse(data[3]).doubleValue());
        produto.setTamanho(FORMATO_PRECO.parse(data[4]).doubleValue());
        produto.setUnidade(Unidade.valueOf(data[5].toUpperCase()));

        return produto;
    }
    
    public static void main(String[] args) {
		
    	List<Produto> lista = getInstance().loadProdutos();
    	lista.forEach(System.out::println);
	}
}
