package com.spring.SpringWEB.dao;

import com.spring.SpringWEB.models.Usuario;

import java.util.List;

public interface UsuarioDao {
    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registrar(Usuario usuario);

    boolean verificar(Usuario usuario);
}
