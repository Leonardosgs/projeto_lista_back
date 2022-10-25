package br.com.listando.listando.model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usuario_id")
	private int id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private String email;
	
	@Column(name = "data_criacao")
	private LocalDate dataCraiacao = LocalDate.now();
	
	@OneToMany(mappedBy = "usuario")
	private List<Lista> lista = new ArrayList<Lista>();
	
	public Usuario() {
		
	}
	
	public Usuario(String nome, String email, String password) {
		this.nome = nome;
		this.email = email;
		this.password = password;
	}
	
	public void adicionarLista(Lista lista) {
		lista.setUsuario(this);
		this.lista.add(lista);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDataCraiacao() {
		return dataCraiacao;
	}

	public List<Lista> getLista() {
		return lista;
	}
	
	
	
	

}
