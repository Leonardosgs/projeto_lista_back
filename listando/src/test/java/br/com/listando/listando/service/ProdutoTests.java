package br.com.listando.listando.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import br.com.listando.listando.model.entities.Marca;
import br.com.listando.listando.model.entities.Produto;

@SpringBootTest
@ActiveProfiles("test")
public class ProdutoTests {
	
	@Autowired
	private IServiceProduto service;
	@Autowired
	private IServiceMarca serviceM;
	//private static ProdutoServiceImpl service;
	private static Integer idFound = 1;
	private static Integer IdNotFound = 100;
	private static Produto newProduct;
	private static Produto createdProduct;
	private static Produto newProductWithCreatedMarca;
	private static Marca createdMarca;
	
	
	@BeforeAll
	public static void setup() {
		
		newProduct = new Produto();
		newProduct.setNome("Bo");
		newProduct.setMarca(new Marca("Garoto"));
		
		createdMarca = new Marca();
		createdMarca.setNome("Nestle");
		createdMarca.setId(1);
		
		newProductWithCreatedMarca = new Produto();
		newProductWithCreatedMarca.setNome("Leite em Pó");
		newProductWithCreatedMarca.setMarca(createdMarca);
		
		
		
		createdProduct = new Produto();
		createdProduct.setNome("Bolacha");
		createdProduct.setMarca(createdMarca);
		createdProduct.setId(1);
		
//		service = Mockito.mock(ProdutoServiceImpl.class);
//		Mockito.when(service.criarNovoProduto(newProduct)).thenReturn(createdProduct);
//		Mockito.when(service.buscarPorId(idFound)).thenReturn(createdProduct);
//		Mockito.when(service.buscarPorId(IdNotFound)).thenReturn(null);
//		Mockito.when(service.buscarPorPalavraChave("b")).thenReturn(new ArrayList<Produto>());
//		Mockito.when(service.listarTodos()).thenReturn(new ArrayList<Produto>());
//		Mockito.when(service.alterarProduto(createdProduct)).thenReturn(createdProduct);
	}
	
	@Test
	public void shouldRecordProduct() {
		serviceM.CriarNovaMarca(newProduct.getMarca());
		assertNotNull(service.CriarNovoProduto(newProduct));
	}
	
	@Test
	public void shouldRecordProductWithCreatedMarca() {
		serviceM.CriarNovaMarca(createdMarca);
		createdMarca = serviceM.BuscarPorId(newProductWithCreatedMarca.getMarca().getId());
		assertNotNull(service.CriarNovoProduto(newProductWithCreatedMarca));
	}
	
	
	

}
