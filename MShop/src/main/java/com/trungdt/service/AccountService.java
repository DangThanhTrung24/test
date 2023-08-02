package com.trungdt.service;

import java.util.List;

import com.trungdt.entity.Account;

public interface AccountService {
	
	public Account findById(String username);

	public List<Account> getAdministrators();

	public List<Account> findAll();
}
