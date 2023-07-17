package com.spring.SpringWEB.dao;

import com.spring.SpringWEB.models.Usuario;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Usuario> getUsuarios() {
        String consulta = "FROM Usuario";
        return entityManager.createQuery(consulta).getResultList();
    }

    @Override
    public void eliminar(Long id) {
        Usuario usuario = entityManager.find(Usuario.class, id);
        entityManager.remove(usuario);
    }

    @Override
    public void registrar(Usuario usuario) {
        entityManager.merge(usuario);
    }

    @Override
    public boolean verificar(Usuario usuario) {
        String consulta = "FROM Usuario WHERE email = :email";
        List<Usuario> lista = entityManager.createQuery(consulta)
                .setParameter("email", usuario.getEmail())
                .getResultList();

        if (lista.isEmpty()){
            return false;
        }

        String contraEncrip = lista.get(0).getPassword();
        Argon2 argoncete = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        return argoncete.verify(contraEncrip, usuario.getPassword());
    }
}
