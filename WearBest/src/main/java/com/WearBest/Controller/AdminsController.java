package com.WearBest.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.WearBest.Model.Admins;
import com.WearBest.Model.CurrentSession;
import com.WearBest.Model.LoginDTO;
import com.WearBest.Serivices.AdminService;

import jakarta.validation.Valid;

@RestController
public class AdminsController {
	
	private AdminService adminservice;
	
	@PostMapping("/registerAdmins")
	public Admins registerAdmins(@Valid @RequestBody Admins admin) {
		
		return adminservice.registerAdmin(admin);
		
		
	}
	@PostMapping("/LoginAdmin")
	public CurrentSession registerAdmins(@Valid @RequestBody LoginDTO lDto) {
		
		return adminservice.loginAdmin(lDto);
		
		
	}
	

}
