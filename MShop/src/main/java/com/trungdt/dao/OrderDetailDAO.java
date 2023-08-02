package com.trungdt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trungdt.entity.OrderDetail;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Integer>{

}
