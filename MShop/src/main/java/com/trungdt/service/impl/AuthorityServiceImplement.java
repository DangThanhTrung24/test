package com.trungdt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trungdt.dao.AccountDAO;
import com.trungdt.dao.AuthorityDAO;
import com.trungdt.entity.Account;
import com.trungdt.entity.Authority;
import com.trungdt.service.AuthorityService;

@Service
public class AuthorityServiceImplement implements AuthorityService{
	@Autowired
	AuthorityDAO dao;
	@Autowired
	AccountDAO acDao;

	
	public Authority create(Authority auth) {
		return dao.save(auth);
	}


	
	public List<Authority> findAll() {
		
		return dao.findAll();
	}


	
	public void delete(Integer id) {
		dao.deleteById(id);
	}
	
	public List<Authority> findAuthoritiesOfAdministrators() {
		List<Account> accounts = acDao.getAdministrators();
		return dao.authoritiesOf(accounts);
	}
}
