package com.lorem.Travell.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "viagens")
public class Destino {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


	@Column(nullable = false)
	private String nome;
	@Column(nullable = false)
	private String sobrenome;
	@Column(nullable = false)
	private String email;
	@Column(nullable = false)
	private String pagamento;
	@Column(nullable = false)
	private String  estado;
	@Column(nullable = false)
	private Number numero_casa;
	@Column(nullable = false)
	private String cep;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPagamento() {
		return pagamento;
	}
	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Number getNumero_casa() {
		return numero_casa;
	}
	public void setNumero_casa(Number numero_casa) {
		this.numero_casa = numero_casa;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Destino(Long id, String nome, String sobrenome, String email, String pagamento, String estado,
			Number numero_casa, String cep) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.pagamento = pagamento;
		this.estado = estado;
		this.numero_casa = numero_casa;
		this.cep = cep;
	}
	public Destino() {
		super();
	
	}
	
	
	
	
	

}
