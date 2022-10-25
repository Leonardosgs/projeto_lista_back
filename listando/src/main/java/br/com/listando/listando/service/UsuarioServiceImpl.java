package br.com.listando.listando.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.listando.listando.model.entities.Usuario;
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
		return repo.findById(id).get();
	}

	@Override
	public List<Usuario> verTodos() {
		return null;
	}

	@Override
	public List<Usuario> buscarPorChave(String chave) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
