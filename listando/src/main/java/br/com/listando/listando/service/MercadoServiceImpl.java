package br.com.listando.listando.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.listando.listando.models.entities.Mercado;
import br.com.listando.listando.models.entities.Usuario;
import br.com.listando.listando.repository.MercadoRepository;

@Component
public class MercadoServiceImpl implements IServiceMercado{

	@Autowired
	private MercadoRepository repo;
	
	@Override
	public Mercado criarNovoMercado(Mercado mercado) {
		return repo.save(mercado);
	}

	@Override
	public Mercado alterarMercado(Mercado mercado) {
		return repo.save(mercado);
	}

	@Override
	public void removerMercado(Mercado mercado) {
		repo.deleteById(mercado.getId());
		
	}

	@Override
	public List<Mercado> listarTodos() {
		return (List<Mercado>) repo.findAll();
	}

	@Override
	public List<Mercado> buscarPorPalavraChave(String key) {
		return repo.findByNomeContainingIgnoreCase(key);
	}

	@Override
	public List<Mercado> buscarMercadoPorUsuarioEComPalvraChave(Usuario user, String palavraChave) {
		return repo.findByUsuarioIdAndNomeContainingIgnoreCase(user.getId(), palavraChave);
	}

	@Override
	public Mercado buscarPorId(int id) {
		return repo.findById(id).orElse(null);
	}
	
	
}
