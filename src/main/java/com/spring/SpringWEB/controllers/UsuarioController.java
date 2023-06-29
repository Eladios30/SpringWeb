package com.spring.SpringWEB.controllers;

import com.spring.SpringWEB.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Eladio");
        usuario.setApellido("Quintero");
        usuario.setEmail("eladioquien@gmail.com");
        usuario.setTelefono("6511063209");

        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){

        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(245L);
        usuario.setNombre("Eladio");
        usuario.setApellido("Quintero");
        usuario.setEmail("eladioquien@gmail.com");
        usuario.setTelefono("6511063209");

        Usuario usuario2 = new Usuario();
        usuario2.setId(246L);
        usuario2.setNombre("Vivi");
        usuario2.setApellido("Quintero");
        usuario2.setEmail("vivi@gmail.com");
        usuario2.setTelefono("6511005657");

        Usuario usuario3 = new Usuario();
        usuario3.setId(247L);
        usuario3.setNombre("Raul");
        usuario3.setApellido("Garcia");
        usuario3.setEmail("ruloquien@gmail.com");
        usuario3.setTelefono("6511042196");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
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
