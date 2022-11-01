package br.com.listando.listando.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.listando.listando.models.entities.Usuario;
import br.com.listando.listando.repository.UsuarioRepository;

@Component
public class UsuarioServiceImpl implements IServiceUsuario{
	
	@Autowired
	private UsuarioRepository repo;
	
	@Override
	public Usuario criarNovoUsuario(Usuario usuario) {
		return repo.save(usuario);
	}

	@Override
	public Usuario alterarUsuario(Usuario usuario) {
		return repo.save(usuario);
	}

	@Override
	public void removerUsuario(Usuario usuario) {
		repo.delete(usuario);
	}

	@Override
	public Usuario buscarPorId(int id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public List<Usuario> buscarTodos() {
		return (List<Usuario>) repo.findAll();
	}

	@Override
	public List<Usuario> buscarUsuarioPorChave(String chave) {
		return repo.findByNomeContainingIgnoreCase(chave);
	}

	@Override
	public Usuario buscarPorEmail(String email) {
		return repo.findByEmail(email).orElse(null);
	}
	
	
	
	
}
