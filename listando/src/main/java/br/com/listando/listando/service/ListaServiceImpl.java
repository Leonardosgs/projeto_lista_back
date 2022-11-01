package br.com.listando.listando.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.listando.listando.models.entities.Lista;
import br.com.listando.listando.models.entities.Usuario;
import br.com.listando.listando.repository.ListaRepository;

@Component
public class ListaServiceImpl implements IServiceLista{
	
	@Autowired
	private ListaRepository repo; 
	
	@Override
	public Lista criarNovaLista(Lista lista) {
		return repo.saveAndFlush(lista);
	}

	@Override
	public Lista alterarLista(Lista lista) {
		return repo.save(lista);
	}

	@Override
	public void removerLista(Lista lista) {
		repo.delete(lista);
	}

	@Override
	public List<Lista> verTodas() {
		return (List<Lista>) repo.findAll();
	}

	@Override
	public List<Lista> buscarListasPorUsuario(Usuario usuario) {
		return null;
	}
	
	
}
