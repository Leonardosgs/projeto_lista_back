package br.com.listando.listando.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import br.com.listando.listando.models.entities.Lista;

public interface ListaRepository extends JpaRepository<Lista, Integer>{
	//public List<Lista> findByUsuarioId(Integer id);

}
