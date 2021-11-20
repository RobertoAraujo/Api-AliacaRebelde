package com.poshyweb.service;

import com.poshyweb.model.Produto;
import com.poshyweb.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;


//    // methodo de tratamento se nao tiver retorna mensagem
//    public Produto findById(Long id) throws ObjectNotFoundException {
//        Optional<Produto> objProduto = produtoRepository.findById(id);
//        return objProduto.orElseThrow(()-> new ObjectNotFoundException("Produto não encontrado!  id:"+ id + "tipo: "+ Produto.class.getName()));
//    }
//    // methodo de lsita todos pro categoria
//    public List<Produto> findAll(Long id_cat) throws ObjectNotFoundException {
//        categoriaService.findByIderro(id_cat);
//        return  produtoRepository.findByCategoria(id_cat);
//    }
//    // methodo de atualizar
//    public Produto update(Long id, Produto objPoProd) throws ObjectNotFoundException {
//        Produto novoProd = findById(id);
//        updateData(novoProd, objPoProd);
//        return produtoRepository.save(novoProd);
//    }
//    // tranferenia de informação
//    private void updateData(Produto novoProd, Produto objPoProd) {
//        novoProd.setNome(objPoProd.getNome());
//        novoProd.setPreco(objPoProd.getPreco());
//
//    }
//
//    public Produto create(Long id_cat, Produto obProd) {
//        obProd.setId(null);
//        Categoria cat= categoriaService.findByIderro(id_cat);
//        obProd.setCategoria(cat);
//        return Repository.save(obProd);
//    }
//
//    public void delete(Long id) {
//        Produto novoProd = findById(id);
//        Repository.delete(novoProd);
//    }
}
