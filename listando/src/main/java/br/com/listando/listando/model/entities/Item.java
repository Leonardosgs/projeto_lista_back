package br.com.listando.listando.model.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "itens")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "item_id")
	private int id;
	
	private int quantidade;
	
	@Column(name = "preco_unitario")
	private BigDecimal precoUnidade;
	
	@Transient
	private BigDecimal valor = BigDecimal.ZERO;
	
	@ManyToOne
	@JoinColumn(name = "lista_id")
	private Lista lista;
	
	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Produto produto;
	
	
	public Item() {
	}


	public Item(int id, int quantidade, BigDecimal precoUnidade, Lista lista, Produto produto) {
		super();
		this.id = id;
		this.quantidade = quantidade;
		this.precoUnidade = precoUnidade;
		this.lista = lista;
		this.produto = produto;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public BigDecimal getPrecoUnidade() {
		return precoUnidade;
	}


	public void setPrecoUnidade(BigDecimal precoUnidade) {
		this.precoUnidade = precoUnidade;
	}


	public Lista getLista() {
		return lista;
	}


	public void setLista(Lista lista) {
		this.lista = lista;
	}


	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public BigDecimal getValor() {
		return this.valor = precoUnidade.multiply(new BigDecimal(quantidade));
	}
	

}
