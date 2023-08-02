package com.trungdt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trungdt.dao.RoleDAO;
import com.trungdt.entity.Role;
import com.trungdt.service.RoleService;

@Service
public class RoleServiceImplement implements RoleService{
	@Autowired
	RoleDAO roleDAO;

	@Override
	public List<Role> getAll() {
	
		return roleDAO.findAll();
	}
	
	
}
