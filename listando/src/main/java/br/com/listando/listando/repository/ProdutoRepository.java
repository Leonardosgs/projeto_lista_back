package br.com.listando.listando.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.listando.listando.models.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
	public List<Produto> findByNomeContainingIgnoreCase(String s);
	public List<Produto> findByUsuarioIdAndNomeContainingIgnoreCase(Integer userId, String chave);

}
