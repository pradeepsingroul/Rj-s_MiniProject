package com.WearBest.Model;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ExceptionsDetails {
	
	private LocalDateTime ldt;
	private String message;
	private String details;
	
	

}
