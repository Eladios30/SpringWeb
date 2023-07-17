package com.spring.SpringWEB.controllers;

import com.spring.SpringWEB.dao.UsuarioDao;
import com.spring.SpringWEB.models.Usuario;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//HI
@RestController
public class UsuarioController {
    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.GET)
    public Usuario getUsuarios(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Eladio");
        usuario.setApellido("Quintero");
        usuario.setEmail("eladioquien@gmail.com");
        usuario.setTelefono("6511063209");
        return usuario;
    }
    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void getUsuarios(@RequestBody Usuario usuario){
        Argon2 argonsito = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        String contra = argonsito.hash(1, 500, 1, usuario.getPassword());
        usuario.setPassword(contra);
        usuarioDao.registrar(usuario);
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@PathVariable Long id){
        usuarioDao.eliminar(id);
    }
}
