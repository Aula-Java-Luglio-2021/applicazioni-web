package com.celm.itests.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.celm.itests.model.Account;

public interface RepoAccount extends JpaRepository<Account,Integer>{
	
	@Query("from Account a where a.username=:username and a.password=:password")
	public Account login(@Param("username") String username,@Param("password") String password);
}
