package com.celm.itests.model;

import java.sql.Date;

import javax.persistence.*;
@Entity
@Table(name="esiti")
public class Esito {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(nullable=false)
	private Date data;
	
	@Column(nullable=false,name="n_risp")
	private int nRisp;
	
	@ManyToOne
	@JoinColumn(name="id_account",referencedColumnName="id")
	private Account account;
	
	public Esito() {}

	public Esito(int id, Date data, int nRisp, Account account) {
		this.id = id;
		this.data = data;
		this.nRisp = nRisp;
		this.account = account;
	}
	
	public Esito(Date data, int nRisp, Account account) {
		this.data = data;
		this.nRisp = nRisp;
		this.account = account;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getnRisp() {
		return nRisp;
	}

	public void setnRisp(int nRisp) {
		this.nRisp = nRisp;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + id;
		result = prime * result + nRisp;
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
		Esito other = (Esito) obj;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (id != other.id)
			return false;
		if (nRisp != other.nRisp)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return id + "," + data + "," + nRisp + "," + account;
	}
	
	
}
