package br.com.listando.listando.service;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.annotation.DirtiesContext.ClassMode;
import org.springframework.test.context.ActiveProfiles;

import br.com.listando.listando.models.entities.Mercado;
import br.com.listando.listando.models.entities.Usuario;

@SpringBootTest
@ActiveProfiles("test")
@DirtiesContext(classMode = ClassMode.BEFORE_EACH_TEST_METHOD)
public class MercadoTests {
	
	@Autowired
	private IServiceMercado service;
	
	@Autowired
	private IServiceUsuario serviceU;
	
	private static Mercado m;
	private static Mercado m2;
	private static Mercado m3;
	private static Mercado mCriado;
	private static List<Mercado> listaTest;
	private static Usuario usuario;
	
	@BeforeAll
	public static void setup() {
		
		usuario = new Usuario();
		usuario.setNome("Pedro");
		usuario.setEmail("pedro@email.com");
		usuario.setPassword("12345");
		
		m = new Mercado();
		m.setNome("Confiança");
		m.setUsuario(usuario);
		
		m2 = new Mercado();
		m2.setNome("Atacadão");
		
		m3 = new Mercado();
		m3.setNome("Tauste");
		
		
		mCriado = new Mercado();
		mCriado.setNome("Tauste");
		mCriado.setId(3);
		
		listaTest = new ArrayList<>();
		
	}
	
	@BeforeEach
	public void setupServices() {
		serviceU.criarNovoUsuario(usuario);
		
		service.criarNovoMercado(m);
		service.criarNovoMercado(m2);
		
		listaTest.add(m);
		listaTest.add(m2);
	}
	
	@Test
	public void shouldCreateMarket() {
		assertEquals(mCriado, service.criarNovoMercado(m3));
	}
	
	@Test
	public void shouldAlterMarket() {
		Mercado mercado = service.buscarPorId(1);
		mercado.setNome("Comper");
		assertEquals(mercado, service.alterarMercado(mercado));;
	}
	
	@Test
	public void shouldRemoveMarket() {
		service.removerMercado(m2);
		assertNull(service.buscarPorId(2));
	}
	
	@Test
	public void shouldListAll() {
		assertTrue(listaTest.containsAll(service.listarTodos()));
	}
	
	@Test
	public void shouldFindByKeyword() {
		assertTrue(service.buscarPorPalavraChave("c").contains(m));
	}
	
	@Test
	public void shouldFindById() {
		assertEquals(m, service.buscarPorId(1));
	}
	
	@Test
	public void shouldFindByUserAndByKeyword() {
		assertTrue(service.buscarMercadoPorUsuarioEComPalvraChave(usuario, "c").contains(m));
	}
	
	
}
