package br.com.listando.listando.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.listando.listando.models.entities.Item;
import br.com.listando.listando.models.entities.Lista;
import br.com.listando.listando.repository.ItemRepository;

@Component
public class ItemServiceImpl implements IServiceItem{
	
	@Autowired
	private ItemRepository repo;
	
	@Override
	public Item criarNovoItem(Item item) {
		return repo.saveAndFlush(item);
	}

	@Override
	public Item buscarItemPorId(Item item) {
		return repo.findById(item.getId()).orElse(null);
	}

	@Override
	public void removerItem(Item item) {
		repo.deleteById(item.getId());
		
	}

	@Override
	public List<Item> listarItensPorLista(Lista lista) {
		return repo.findByListaId(lista.getId());
	}
	
	

}
