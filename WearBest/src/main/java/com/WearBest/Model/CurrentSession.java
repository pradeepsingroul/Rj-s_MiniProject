package com.WearBest.Model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@Entity
@NoArgsConstructor
public class CurrentSession {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer crId;
	private Integer key;
	private String email;
	private String password;
	
	private LocalDate ldate;

}
