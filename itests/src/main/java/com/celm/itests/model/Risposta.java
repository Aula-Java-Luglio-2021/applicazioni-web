package com.celm.itests.model;

import javax.persistence.*;
@Entity
@Table(name="risposte")
public class Risposta {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(nullable=false)
	private String risposta;
	
	@Column(name="risposta_giusta",nullable=false)
	private boolean rispostaGiusta;
	
	@ManyToOne
	@JoinColumn(name="id_domanda",referencedColumnName="id")
	private Domanda domanda;
	
	public Risposta() {}

	public Risposta(int id, String risposta, boolean rispostaGiusta, Domanda domanda) {
		this.id = id;
		this.risposta = risposta;
		this.rispostaGiusta = rispostaGiusta;
		this.domanda = domanda;
	}
	
	public Risposta(String risposta, boolean rispostaGiusta, Domanda domanda) {
		this.risposta = risposta;
		this.rispostaGiusta = rispostaGiusta;
		this.domanda = domanda;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRisposta() {
		return risposta;
	}

	public void setRisposta(String risposta) {
		this.risposta = risposta;
	}

	public boolean isRispostaGiusta() {
		return rispostaGiusta;
	}

	public void setRispostaGiusta(boolean rispostaGiusta) {
		this.rispostaGiusta = rispostaGiusta;
	}

	public Domanda getDomanda() {
		return domanda;
	}

	public void setDomanda(Domanda domanda) {
		this.domanda = domanda;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((domanda == null) ? 0 : domanda.hashCode());
		result = prime * result + id;
		result = prime * result + ((risposta == null) ? 0 : risposta.hashCode());
		result = prime * result + (rispostaGiusta ? 1231 : 1237);
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
		Risposta other = (Risposta) obj;
		if (domanda == null) {
			if (other.domanda != null)
				return false;
		} else if (!domanda.equals(other.domanda))
			return false;
		if (id != other.id)
			return false;
		if (risposta == null) {
			if (other.risposta != null)
				return false;
		} else if (!risposta.equals(other.risposta))
			return false;
		if (rispostaGiusta != other.rispostaGiusta)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return id + "," + risposta + "," + rispostaGiusta + ","
				+ domanda;
	}
	
	
	
}
