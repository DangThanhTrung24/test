package com.trungdt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trungdt.entity.Role;

public interface RoleDAO extends JpaRepository<Role, String>{

}
