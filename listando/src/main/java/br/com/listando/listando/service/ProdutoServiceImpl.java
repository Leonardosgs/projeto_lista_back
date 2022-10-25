package br.com.listando.listando.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.listando.listando.model.entities.Produto;
import br.com.listando.listando.repository.ProdutoRepository;

@Component
public class ProdutoServiceImpl implements IServiceProduto{
	
	@Autowired
	private ProdutoRepository repository;

	@Override
	public Produto criarNovoProduto(Produto produto) {
		return repository.save(produto);
	}

	@Override
	public Produto alterarProduto(Produto produto) {
		return repository.save(produto);
	}

	@Override
	public void removerProduto(Produto produto) {
		repository.delete(produto);
	}

	@Override
	public List<Produto> listarTodos() {
		List<Produto> lista = new ArrayList<>();
		repository.findAll().forEach(p -> lista.add(p));
		return lista;
	}

	@Override
	public List<Produto> buscarPorPalavraChave(String key) {
		return repository.findByNomeContaining(key.substring(0).toUpperCase());
	}

	@Override
	public List<Produto> buscarPorUsuarioComPalavraChave(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto buscarPorId(int id) {
		return repository.findById(id).orElse(null);
	}
	
	

}
