package com.WearBest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WearBest.Model.Address;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer>{
	

}
