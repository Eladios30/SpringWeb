package com.spring.SpringWEB.controllers;

import com.spring.SpringWEB.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario")
    public Usuario getUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Eladio");
        usuario.setApellido("Quintero");
        usuario.setEmail("eladioquien@gmail.com");
        usuario.setTelefono("6511063209");

        return usuario;
    }

    @RequestMapping(value = "usuario/{id}")
    public Usuario editar(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Eladio");
        usuario.setApellido("Quintero");
        usuario.setEmail("eladioquien@gmail.com");
        usuario.setTelefono("6511063209");

        return usuario;
    }

    @RequestMapping(value = "usuario1")
    public Usuario ed(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Eladio");
        usuario.setApellido("Quintero");
        usuario.setEmail("eladioquien@gmail.com");
        usuario.setTelefono("6511063209");

        return usuario;
    }

    @RequestMapping(value = "usuario2")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Eladio");
        usuario.setApellido("Quintero");
        usuario.setEmail("eladioquien@gmail.com");
        usuario.setTelefono("6511063209");

        return usuario;
    }
}
