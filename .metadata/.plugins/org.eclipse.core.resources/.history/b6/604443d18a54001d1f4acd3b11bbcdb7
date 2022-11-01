package br.com.listando.listando.service;

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
	public Produto CriarNovoProduto(Produto produto) {
		return repository.save(produto);
	}

	@Override
	public Produto AlterarProduto(Produto produto) {
		return repository.save(produto);
	}

	@Override
	public Produto RemoverProduto(Produto produto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> ListarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> BuscarPorPalavraChave(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> BuscarPorUsuarioComPalavraChave(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto BuscarPorId(int id) {
		return repository.findById(id).get();
	}

	
	

}
