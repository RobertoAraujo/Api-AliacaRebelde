package com.poshyweb.controller;

import com.poshyweb.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class InventarioController {

    @Autowired
    public InventarioService service;


}
