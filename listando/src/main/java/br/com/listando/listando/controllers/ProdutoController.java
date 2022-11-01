package br.com.listando.listando.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.listando.listando.models.entities.Produto;
import br.com.listando.listando.service.IServiceProduto;

@RestController
public class ProdutoController {
	
	@Autowired
	private IServiceProduto service;
	
	@PostMapping("/produtos")
	public ResponseEntity<Produto> cadastrarProduto(@RequestBody Produto produto){
		Produto prod = service.criarNovoProduto(produto);
		if(prod != null) {
			return ResponseEntity.status(HttpStatus.CREATED).body(prod);
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	}
	

}
