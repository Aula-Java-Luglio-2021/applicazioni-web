package com.celm.itests.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.celm.itests.model.Domanda;

public interface RepoDomanda extends JpaRepository<Domanda,Integer>{

}
