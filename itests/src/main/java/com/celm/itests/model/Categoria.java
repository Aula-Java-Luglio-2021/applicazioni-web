package com.celm.itests.model;

import java.util.*;

import javax.persistence.*;
@Entity
@Table(name="categorie")
public class Categoria {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(length=30, nullable=false, unique=true)
	private String categoria;
	
	@OneToMany(mappedBy="categoria")
	private List<Domanda> listaDomanda;
	
	public Categoria() {}

	public Categoria(int id, String categoria, List<Domanda> listaDomanda) {
		this.id = id;
		this.categoria = categoria;
		this.listaDomanda = listaDomanda;
	}
	
	public Categoria(String categoria, List<Domanda> listaDomanda) {
		this.categoria = categoria;
		this.listaDomanda = listaDomanda;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public List<Domanda> getListaDomanda() {
		return listaDomanda;
	}

	public void setListaDomanda(List<Domanda> listaDomanda) {
		this.listaDomanda = listaDomanda;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + id;
		result = prime * result + ((listaDomanda == null) ? 0 : listaDomanda.hashCode());
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
		Categoria other = (Categoria) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (id != other.id)
			return false;
		if (listaDomanda == null) {
			if (other.listaDomanda != null)
				return false;
		} else if (!listaDomanda.equals(other.listaDomanda))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return id + "," + categoria + "," + listaDomanda;
	}
	
	
	
}
