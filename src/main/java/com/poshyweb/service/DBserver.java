package com.poshyweb.service;

import com.poshyweb.repository.InventarioRepository;
import com.poshyweb.repository.LocalizacaoRepository;
import com.poshyweb.repository.RebeldeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DBserver {

    @Autowired
    private LocalizacaoRepository localizacao;

    @Autowired
    private InventarioRepository inventario;

    @Autowired
    private RebeldeRepository rebelde;

    public void istanciaBaseDeDados() {
//        // istanciando a categoria e inserido pelo construtor
//        Categoria cat = new Categoria(null, "Informatica", "Aparelhos e Perifericos");
//        Categoria cat1 = new Categoria(null, "Informatica", "Perifericos");
//        Categoria cat2 = new Categoria(null, "Moveis", "Moveis em geral");
//        Categoria cat3 = new Categoria(null, "Moveis", "Moveis meia boca");
//        Categoria cat4 = new Categoria(null, "Moveis", "Moveis primeira linha");
//        Categoria cat5 = new Categoria(null, "Moveis", "Moveis jogaram fora");
//
//        // istanciando o Produto e inserido pelo construtor
//        Produto prod = new Produto(null, "Mause", 20.22, cat);
//        Produto prod1 = new Produto(null, "Mause", 20.22, cat);
//        Produto prod2 = new Produto(null, "Mause", 20.22, cat);
//        Produto prod3 = new Produto(null, "Mause", 20.22, cat);
//        Produto prod4 = new Produto(null, "Mause", 20.22, cat);
//        Produto prod5 = new Produto(null, "Mause", 20.22, cat);
//
//        cat.getProduto().addAll(Arrays.asList(prod, prod1));
//        cat2.getProduto().addAll(Arrays.asList(prod2, prod3, prod4, prod5));
//
//        // salva todas as categorias que forem lsiatda cat, cat1 ,cat2, cat3
//        this.categoriaRepository.saveAll(Arrays.asList(cat, cat1, cat2, cat3, cat4, cat5));
//        // salva todos os produto que forem lsiatdo prod , prod1 ,prod2 etc.......
//        this.produtoRepository.saveAll(Arrays.asList(prod, prod1, prod2, prod3, prod4, prod5));
    }
}
