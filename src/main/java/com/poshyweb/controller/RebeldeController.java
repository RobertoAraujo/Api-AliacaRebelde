package com.poshyweb.controller;

import com.poshyweb.dto.DtoRebelde;
import com.poshyweb.model.Rebelde;
import com.poshyweb.service.RebeldeSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class RebeldeController {

    @Autowired
    private RebeldeSevice service;

//    @GetMapping(value = "/{id}")
//    public ResponseEntity<Rebelde> findById(@PathVariable Long id) throws ObjectNotFoundException{
//        Rebelde objRebelde = service.findByIderro(id);
//        return ResponseEntity.ok().body(objRebelde);
//
//    }

    @GetMapping(value = "/v1/listar")
    public ResponseEntity<List<Rebelde>> findAll(){
        List<Rebelde> list = service.findAll();
        List<DtoRebelde> listDTO = list.stream().map( objRebelde -> new DtoRebelde(objRebelde)).collect(Collectors.toList());
        return ResponseEntity.ok().body(list);
    }

    // salva no banco
    @PostMapping(value = "/v1/cadastro")
    public ResponseEntity<Rebelde> create(@Validated @RequestBody Rebelde objRebelde){
        objRebelde = service.create(objRebelde);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(objRebelde.getId()).toUri();
        return ResponseEntity.created(uri).build();

    }


}
