package com.spring.SpringWEB.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "prueba")
    public List<String> prueba(){
            return List.of("MAnzana", "Kiwi", "Platano");
    }
}
