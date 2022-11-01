package br.com.listando.listando.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import br.com.listando.listando.models.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{
	public List<Item> findByListaId(Integer listaId);

}
