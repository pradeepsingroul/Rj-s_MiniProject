package com.WearBest.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@ToString
public class Admins {
	
	@Id
	private Integer adminId;
	
	private String adminName;
	@Email
	private String adminEmail;
	@NotNull
	private String adminPassword;
	

}
