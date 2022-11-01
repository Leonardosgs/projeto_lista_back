package br.com.listando.listando.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.listando.listando.models.entities.Marca;

public interface MarcaRepository extends CrudRepository<Marca, Integer> {
	public List<Marca> findByNomeContainingIgnoreCase(String key);
	public List<Marca> findByUsuarioIdAndNomeContainingIgnoreCase(Integer usuarioId, String nome);

}
