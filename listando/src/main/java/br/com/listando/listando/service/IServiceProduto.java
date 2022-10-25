package br.com.listando.listando.service;

import java.util.List;

import br.com.listando.listando.model.entities.Produto;

public interface IServiceProduto{
	
	public Produto CriarNovoProduto(Produto produto);
	public Produto AlterarProduto(Produto produto);
	public Produto RemoverProduto (Produto produto);
	public List<Produto> ListarTodos();
	public List<Produto> BuscarPorPalavraChave(String key);
	public List<Produto> BuscarPorUsuarioComPalavraChave(String key);
	public Produto BuscarPorId(int id);

}
