package com.celm.itests.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.celm.itests.model.Categoria;

public interface RepoCategoria extends JpaRepository<Categoria,Integer> {
	public Categoria findById(int idCat);
}
