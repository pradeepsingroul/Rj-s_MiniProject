package com.WearBest.Serivices;

import java.util.List;

import com.WearBest.Exceptions.AdminExcepions;
import com.WearBest.Exceptions.CustomerExceptions;
import com.WearBest.Model.Admins;
import com.WearBest.Model.CurrentSession;
import com.WearBest.Model.Customers;
import com.WearBest.Model.LoginDTO;

public interface AdminService {
	

    public Admins registerAdmin(Admins admin) throws AdminExcepions;
	
	
    public CurrentSession loginAdmin(LoginDTO lDto) throws AdminExcepions;
	
}
