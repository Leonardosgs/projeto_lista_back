package br.com.listando.listando.service;

import java.util.List;

import br.com.listando.listando.models.entities.Item;
import br.com.listando.listando.models.entities.Lista;

public interface IServiceItem {
	
	public Item criarNovoItem(Item item);
	public Item buscarItemPorId(Item item);
	public void removerItem(Item item);
	public List<Item> listarItensPorLista(Lista lista);
}
