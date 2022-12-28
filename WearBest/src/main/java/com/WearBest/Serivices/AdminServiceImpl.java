package com.WearBest.Serivices;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WearBest.Exceptions.AdminExcepions;
import com.WearBest.Exceptions.CustomerExceptions;
import com.WearBest.Model.Admins;
import com.WearBest.Model.CurrentSession;
import com.WearBest.Model.Customers;
import com.WearBest.Model.LoginDTO;
import com.WearBest.Repository.AdminRepo;
import com.WearBest.Repository.CurrentSessionRepo;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepo adRepo;
	
	@Autowired
	private CurrentSessionRepo crRepo;
	

	@Override
	public Admins registerAdmin(Admins admin) throws AdminExcepions {
		// TODO Auto-generated method stub
        Optional<Admins> opt =  adRepo .findById(admin.getAdminId());
        if(opt.isEmpty()) {
        	throw new AdminExcepions("Admin already exist..please enter correct information");
        }else {
        	return adRepo.save(admin);
        }
		
	}
	
	@Override
	public CurrentSession loginAdmin(LoginDTO ldto) throws AdminExcepions {
		
		Optional<CurrentSession> opt = crRepo.findByEmail(ldto.getEmail());
		if(opt.isEmpty()) {
			throw new AdminExcepions("Admin Already logged In....");
		}else {
			CurrentSession c = new CurrentSession();
			c.setEmail(ldto.getEmail());
			c.setPassword(ldto.getPassword());
			c.setKey((int)Math.random()*10000);
			c.setLdate(LocalDate.now());
			
			return crRepo.save(c);
		}
		
	}


}
