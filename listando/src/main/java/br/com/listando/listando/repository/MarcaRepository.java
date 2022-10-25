package br.com.listando.listando.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.listando.listando.model.entities.Marca;

public interface MarcaRepository extends CrudRepository<Marca, Integer> {

}
