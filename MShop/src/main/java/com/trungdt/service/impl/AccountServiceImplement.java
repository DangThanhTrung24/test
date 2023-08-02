package com.trungdt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trungdt.dao.AccountDAO;
import com.trungdt.entity.Account;
import com.trungdt.service.AccountService;

@Service
public class AccountServiceImplement implements AccountService{
	@Autowired
	AccountDAO accountDAO;
	
	@Override
	public Account findById(String username) {
		Account account = accountDAO.findById(username).get();
		return account;
	}

	@Override
	public List<Account> getAdministrators() {
		return accountDAO.getAdministrators();
	}

	@Override
	public List<Account> findAll() {
		return accountDAO.findAll();
	}
}
