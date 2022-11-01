package br.com.listando.listando.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.listando.listando.models.entities.Marca;
import br.com.listando.listando.models.entities.Produto;
import br.com.listando.listando.models.entities.Usuario;
import br.com.listando.listando.repository.MarcaRepository;

@Component
public class MarcaServiceImpl implements IServiceMarca{
	
	@Autowired
	private MarcaRepository repo;

	@Override
	public Marca criarNovaMarca(Marca marca) {
		return repo.save(marca);
	}

	@Override
	public void removerMarca(Marca marca) {
		repo.deleteById(marca.getId());
	}
	

	@Override
	public Marca buscarPorId(int id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public List<Marca> listarTodos() {
		return (List<Marca>) repo.findAll();
	}

	@Override
	public List<Marca> buscarPorPalavraChave(String key) {
		return repo.findByNomeContainingIgnoreCase(key);
	}

	@Override
	public List<Marca> buscarMarcaPorUsuarioEComNome(Usuario user, String nome) {
		List<Marca> lista = repo.findByUsuarioIdAndNomeContainingIgnoreCase(user.getId(), nome);
		return lista;
	}


	

}
