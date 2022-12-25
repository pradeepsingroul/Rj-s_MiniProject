package com.WearBest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WearBest.Model.Products;

@Repository
public interface ProductRepo extends JpaRepository<Products, Integer>{

}
