package br.com.listando.listando.service;

import java.util.List;

import br.com.listando.listando.model.entities.Produto;

public interface IServiceProduto{
	
	public Produto criarNovoProduto(Produto produto);
	public Produto alterarProduto(Produto produto);
	public void removerProduto (Produto produto);
	public List<Produto> listarTodos();
	public List<Produto> buscarPorPalavraChave(String key);
	public List<Produto> buscarPorUsuarioComPalavraChave(String key);
	public Produto buscarPorId(int id);

}
