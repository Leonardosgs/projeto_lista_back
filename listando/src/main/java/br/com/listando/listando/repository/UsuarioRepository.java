package br.com.listando.listando.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.listando.listando.model.entities.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

}
