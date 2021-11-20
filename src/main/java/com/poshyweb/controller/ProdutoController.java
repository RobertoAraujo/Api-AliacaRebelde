package com.poshyweb.controller;

import com.poshyweb.model.Produto;
import com.poshyweb.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.UUID;

@RestController
public class ProdutoController {

    @Autowired
    public ProdutoService service;

//    // listar
//    @RequestMapping(path = "/produtos", method = RequestMethod.GET)
//    public ModelAndView listarProduto() {
//        List<Produto> lista = service.findAll();
//        ModelAndView modelAndView = new ModelAndView("produtos");
//        modelAndView.addObject("produtos", lista);
//        return modelAndView;
//    }
//    // chamar requisição de cadastrar
//    @RequestMapping(path = "/produto-cadastro", method = RequestMethod.GET)
//    public ModelAndView cadastroProdutoGet(Produto produto) {
//        return new ModelAndView("produto-cadastro");
//    }
//    // requisição de editar
//    @PostMapping("/update-produto/{id}")
//    public String updateProduto(@PathVariable("id") UUID id, @Validated Produto produto,
//                                BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            produto.setId(id);
//            return "atualizar-produtos";
//        }
//
//        service.save(produto);
//        return "redirect:/produtos";
//    }

//    @GetMapping("/produtos/{id}")
//    public String deleteUser(@PathVariable("id") long id, Model model) {
//        Produto produto = service.findById(id).orElseThrow(() ->
//                new IllegalArgumentException("Id Não Encotrado:" + id));
//        service.delete(produto);
//        return "redirect:/produtos";
//    }
//
//    // salva no banco
//    @RequestMapping(path = "/produto-cadastro", method = RequestMethod.POST)
//    public ModelAndView CadastroProdutoPost(Produto produto) {
//        produt.save(produto);
//        return new ModelAndView("produto-cadastro");
//    }
}
