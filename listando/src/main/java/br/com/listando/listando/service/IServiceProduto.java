package br.com.listando.listando.service;

import java.util.List;

import br.com.listando.listando.models.entities.Produto;
import br.com.listando.listando.models.entities.Usuario;

public interface IServiceProduto{
	
	public Produto criarNovoProduto(Produto produto);
	public Produto alterarProduto(Produto produto);
	public void removerProduto (Produto produto);
	public List<Produto> buscarTodos();
	public Produto buscarPorId(int id);
	public List<Produto> buscarPorPalavraChave(String key);
	public List<Produto> buscarPorUsuarioEPalavraChave(Usuario usuario, String palavraChave);
	

}
