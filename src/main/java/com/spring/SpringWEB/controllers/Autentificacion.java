package com.spring.SpringWEB.controllers;

import com.spring.SpringWEB.dao.UsuarioDao;
import com.spring.SpringWEB.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Autentificacion {
    @Autowired
    private UsuarioDao usuarioDao;
    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public String login(@RequestBody Usuario usuario){
        if (usuarioDao.verificar(usuario)){
            return "ok";
        }
        return "Fail";
    }
}
