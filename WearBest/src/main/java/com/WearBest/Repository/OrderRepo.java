package com.WearBest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WearBest.Model.Orders;

@Repository
public interface OrderRepo extends JpaRepository<Orders, Integer>{
	
}
