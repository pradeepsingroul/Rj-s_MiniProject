package com.WearBest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WearBest.Model.Admins;

@Repository
public interface AdminRepo extends JpaRepository<Admins, Integer>{

}
