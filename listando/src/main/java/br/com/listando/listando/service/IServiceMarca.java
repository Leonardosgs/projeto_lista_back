package br.com.listando.listando.service;

import java.util.List;

import br.com.listando.listando.model.entities.Marca;

public interface IServiceMarca {
	
	public Marca CriarNovaMarca(Marca marca);
	public void RemoverMarca (Marca marca);
	public List<Marca> ListarTodos();
	public List<Marca> BuscarPorPalavraChave(String key);
	public List<Marca> BuscarPorUsuarioComPalavraChave(String key);
	public Marca BuscarPorId(int id);

}
