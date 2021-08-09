package com.celm.itests.model;

import java.util.*;

import javax.persistence.*;
@Entity
@Table(name="ruoli")
public class Ruolo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(length=20, nullable=false, unique=true)
	private String ruolo;
	
	@OneToMany(mappedBy="ruolo")
	private List<Account> listaAccount;
	
	public Ruolo() {}

	public Ruolo(int id, String ruolo, List<Account> listaAccount) {
		this.id = id;
		this.ruolo = ruolo;
		this.listaAccount = listaAccount;
	}
	
	public Ruolo(String ruolo, List<Account> listaAccount) {
		this.ruolo = ruolo;
		this.listaAccount = listaAccount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public List<Account> getListaAccount() {
		return listaAccount;
	}

	public void setListaAccount(List<Account> listaAccount) {
		this.listaAccount = listaAccount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((listaAccount == null) ? 0 : listaAccount.hashCode());
		result = prime * result + ((ruolo == null) ? 0 : ruolo.hashCode());
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
		Ruolo other = (Ruolo) obj;
		if (id != other.id)
			return false;
		if (listaAccount == null) {
			if (other.listaAccount != null)
				return false;
		} else if (!listaAccount.equals(other.listaAccount))
			return false;
		if (ruolo == null) {
			if (other.ruolo != null)
				return false;
		} else if (!ruolo.equals(other.ruolo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return id + "," + ruolo + "," + listaAccount;
	}
	
	
}
