package com.celm.itests.model;

import java.util.*;

import javax.persistence.*;
@Entity
@Table(name="domande")
public class Domanda {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(nullable=false,unique=true)
	private String domanda;
	
	@ManyToOne
	@JoinColumn(name="id_categoria",referencedColumnName="id")
	private Categoria categoria;
	
	@OneToMany(mappedBy="domanda")
	private List<Risposta> listaRisposta;
	
	public Domanda() {}

	public Domanda(int id, String domanda, Categoria categoria, List<Risposta> listaRisposta) {
		this.id = id;
		this.domanda = domanda;
		this.categoria = categoria;
		this.listaRisposta = listaRisposta;
	}
	
	public Domanda(String domanda, Categoria categoria, List<Risposta> listaRisposta) {
		this.domanda = domanda;
		this.categoria = categoria;
		this.listaRisposta = listaRisposta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDomanda() {
		return domanda;
	}

	public void setDomanda(String domanda) {
		this.domanda = domanda;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Risposta> getListaRisposta() {
		return listaRisposta;
	}

	public void setListaRisposta(List<Risposta> listaRisposta) {
		this.listaRisposta = listaRisposta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((domanda == null) ? 0 : domanda.hashCode());
		result = prime * result + id;
		result = prime * result + ((listaRisposta == null) ? 0 : listaRisposta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Domanda other = (Domanda) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (domanda == null) {
			if (other.domanda != null)
				return false;
		} else if (!domanda.equals(other.domanda))
			return false;
		if (id != other.id)
			return false;
		if (listaRisposta == null) {
			if (other.listaRisposta != null)
				return false;
		} else if (!listaRisposta.equals(other.listaRisposta))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return id + "," + domanda + "," + categoria + ","
				+ listaRisposta;
	}
	
	
	
	
	
}
