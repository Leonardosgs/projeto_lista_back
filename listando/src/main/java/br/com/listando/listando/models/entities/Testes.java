package br.com.listando.listando.models.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Testes {
	
	public static void main(String[] args) {
		
		
		Lista lista1;
		Lista lista2;
		Lista lista3;
		Marca marca;
		Produto produto1;
		Produto produto2;
		Produto produto3;
		Mercado mercado;
		Usuario usuario = null;
		Item item1;
		Item item2;
		Item item3;
		
		
		
		
		marca = new Marca();
		marca.setNome("Nestle");
		
		produto1 = new Produto();
		produto1.setNome("Bolacha");
		produto1.setMarca(marca);
		produto1.setUnidadeVolume(UnidadeVolume.GRAMAS);
		produto1.setVolume(270);
		produto1.setId(1);
		
		produto2 = new Produto();
		produto2.setNome("Leite em Pó");
		produto2.setMarca(marca);
		produto2.setId(2);
		
		produto3 = new Produto();
		produto3.setNome("Chocolate");
		produto3.setMarca(marca);
		produto3.setId(3);
		
		item1 = new Item();
		item1.setProduto(produto1);
		item1.setQuantidade(2);
		item1.setPrecoUnidade(BigDecimal.valueOf(3.00));
		
		item2 = new Item();
		item2.setProduto(produto2);
		item2.setQuantidade(1);
		item2.setPrecoUnidade(BigDecimal.valueOf(15.00));
		
		item3 = new Item();
		item3.setProduto(produto3);
		item3.setQuantidade(3);
		item3.setPrecoUnidade(new BigDecimal(5.50));
		
		mercado = new Mercado();
		mercado.setNome("Confiança");
		
		lista1 = new Lista();
		lista1.setNome("Minha Lista");
		lista1.setMercado(mercado);
		lista1.setUsuario(usuario);
		lista1.adicionarItem(item1);
		lista1.adicionarItem(item2);
		lista1.adicionarItem(item3);
		
		lista2 = new Lista();
		lista2.setNome("Minha Lista2");
		lista2.setUsuario(usuario);
		lista2.adicionarItem(item1);
		lista2.adicionarItem(item2);
		lista2.adicionarItem(item3);
		
		lista3 = new Lista();
		lista3.setNome("Minha Lista3");
		lista3.setMercado(mercado);
		lista3.setUsuario(usuario);
		lista3.adicionarItem(item1);
		lista3.adicionarItem(item2);
		lista3.adicionarItem(item3);
		
		
		List<Item> listListaTeste = lista1.getLista();
		
		for (Item item : listListaTeste) {
			System.out.println(item.getProduto().getNome() + "---" + item.getQuantidade() + "----" + item.getPrecoUnidade() + "---" + item.getValor());
		}
	}
}
