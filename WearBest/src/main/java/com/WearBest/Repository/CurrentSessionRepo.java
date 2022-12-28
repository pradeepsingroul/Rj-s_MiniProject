package com.WearBest.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WearBest.Model.CurrentSession;

@Repository
public interface CurrentSessionRepo extends JpaRepository<CurrentSession, Integer>{
	
	
	public Optional<CurrentSession> findByEmail(String kry);

}
