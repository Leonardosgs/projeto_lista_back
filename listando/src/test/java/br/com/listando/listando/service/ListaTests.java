package br.com.listando.listando.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ActiveProfiles;

import br.com.listando.listando.models.entities.Item;
import br.com.listando.listando.models.entities.Lista;
import br.com.listando.listando.models.entities.Marca;
import br.com.listando.listando.models.entities.Mercado;
import br.com.listando.listando.models.entities.Produto;
import br.com.listando.listando.models.entities.UnidadeVolume;
import br.com.listando.listando.models.entities.Usuario;

@SpringBootTest
//@ActiveProfiles("test")
@DirtiesContext(classMode = ClassMode.BEFORE_EACH_TEST_METHOD)
public class ListaTests {
	
	@Autowired
	private IServiceLista service;
	
	@Autowired
	private IServiceMercado serviceMercado;
	
	@Autowired
	private IServiceMarca serviceMarca;
	
	@Autowired
	private IServiceUsuario serviceU;
	
	@Autowired
	private IServiceProduto serviceP;
	
	@Autowired
	private IServiceItem serviceI;
	
	
	private static Lista lista1;
	private static Lista lista2;
	private static Lista lista3;
	private static Marca marca;
	private static Produto produto1;
	private static Produto produto2;
	private static Produto produto3;
	private static List<Lista> listListaTeste;
	private static Mercado mercado;
	private static Usuario usuario;
	private static Item item1;
	private static Item item2;
	private static Item item3;
	
	@BeforeAll
	public static void setup() {
		
		usuario = new Usuario();
		usuario.setNome("Pedro");
		usuario.setEmail("pedro@email.com");
		usuario.setPassword("12345");
		usuario.setId(1);
		
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
		item1.setPrecoUnidade(new BigDecimal(3.0));
		
		item2 = new Item();
		item2.setProduto(produto2);
		item2.setQuantidade(1);
		item2.setPrecoUnidade(new BigDecimal(15.00));
		
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
		
		
	}
	
	@BeforeEach
	public void setupServices() {
		serviceU.criarNovoUsuario(usuario);
		
		serviceMarca.criarNovaMarca(marca);
		
		serviceP.criarNovoProduto(produto1);
		serviceP.criarNovoProduto(produto2);
		serviceP.criarNovoProduto(produto3);
		
		serviceMercado.criarNovoMercado(mercado);
		
		service.criarNovaLista(lista1);
		service.criarNovaLista(lista2);
		
	}
	
	@Test
	public void shouldCreateList() {
		service.criarNovaLista(lista3);
	}
	

}
