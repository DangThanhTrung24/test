package com.trungdt.service;

import java.util.List;

import com.trungdt.entity.Authority;

public interface AuthorityService {

	public  List<Authority> findAuthoritiesOfAdministrators();

	public Authority create(Authority auth);
	
	public List<Authority> findAll();
	
	public void delete(Integer id);

}
