package com.celm.itests.model;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="accounts")
public class Account {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(length=30, nullable=false, unique=true)
	private String username;
	
	@Column(length=30, nullable=false)
	private String password;
	
	@ManyToOne()
	@JoinColumn(name="id_ruolo", referencedColumnName="id")
	private Ruolo ruolo;
	
	@OneToMany(mappedBy="account")
	private List<Esito> listaEsito;
	
	public Account() {}

	public Account(int id, String username, String password, Ruolo ruolo, List<Esito> listaEsito) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.ruolo = ruolo;
		this.listaEsito = listaEsito;
	}
	
	public Account(String username, String password, Ruolo ruolo, List<Esito> listaEsito) {
		this.username = username;
		this.password = password;
		this.ruolo = ruolo;
		this.listaEsito = listaEsito;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Ruolo getRuolo() {
		return ruolo;
	}

	public void setRuolo(Ruolo ruolo) {
		this.ruolo = ruolo;
	}

	public List<Esito> getListaEsito() {
		return listaEsito;
	}

	public void setListaEsito(List<Esito> listaEsito) {
		this.listaEsito = listaEsito;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((listaEsito == null) ? 0 : listaEsito.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((ruolo == null) ? 0 : ruolo.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
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
		Account other = (Account) obj;
		if (id != other.id)
			return false;
		if (listaEsito == null) {
			if (other.listaEsito != null)
				return false;
		} else if (!listaEsito.equals(other.listaEsito))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (ruolo == null) {
			if (other.ruolo != null)
				return false;
		} else if (!ruolo.equals(other.ruolo))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return id + "," + username + "," + password + "," + ruolo
				+ "," + listaEsito;
	}
	
	
	
}
