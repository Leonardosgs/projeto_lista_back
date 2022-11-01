package br.com.listando.listando.service;

import java.util.List;

import br.com.listando.listando.models.entities.Lista;
import br.com.listando.listando.models.entities.Usuario;

public interface IServiceLista {

	public Lista criarNovaLista(Lista lista);

	public Lista alterarLista(Lista lista);

	public void removerLista(Lista lista);

	public List<Lista> verTodas();

	public List<Lista> buscarListasPorUsuario(Usuario usuario);
}
