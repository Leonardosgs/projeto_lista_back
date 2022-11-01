package br.com.listando.listando.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.listando.listando.model.entities.Marca;
import br.com.listando.listando.repository.MarcaRepository;

@Component
public class MarcaServiceImpl implements IServiceMarca{
	
	@Autowired
	private MarcaRepository repo;

	@Override
	public Marca CriarNovaMarca(Marca marca) {
		return repo.save(marca);
	}

	@Override
	public void RemoverMarca(Marca marca) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Marca> ListarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Marca> BuscarPorPalavraChave(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Marca> BuscarPorUsuarioComPalavraChave(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Marca BuscarPorId(int id) {
		return repo.findById(id).get();
	}

	

}
