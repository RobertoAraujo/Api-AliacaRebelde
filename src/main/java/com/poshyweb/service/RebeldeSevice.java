package com.poshyweb.service;

import com.poshyweb.model.Rebelde;
import com.poshyweb.repository.RebeldeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RebeldeSevice {

    @Autowired
    private RebeldeRepository repository;


    public List<Rebelde> findAll(){
        return repository.findAll();
    }

    // serviço de criar objeto
    public Rebelde create(Rebelde objRebelde) {
        objRebelde.setId(null);
        return repository.save(objRebelde);
    }
}
