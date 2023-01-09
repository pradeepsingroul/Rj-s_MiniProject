package com.WearBest.Exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.WearBest.Model.ExceptionsDetails;

public class GlobleException extends RuntimeException{
	
	
	@ExceptionHandler(AddressExceptions.class)
	public ResponseEntity<ExceptionsDetails>  addressException(AddressExceptions  ad, WebRequest we){
		
		ExceptionsDetails ex = new ExceptionsDetails();
		ex.setDetails(we.getDescription(false));
		ex.setLdt(LocalDateTime.now());
		ex.setMessage(ad.getMessage());
		return new ResponseEntity<ExceptionsDetails>(ex,HttpStatus.BAD_GATEWAY);
		
		
	}
	
	@ExceptionHandler(AdminExcepions.class)
	public ResponseEntity<ExceptionsDetails>  adminException(AdminExcepions  ad, WebRequest we){
		
		ExceptionsDetails ex = new ExceptionsDetails();
		ex.setDetails(we.getDescription(false));
		ex.setLdt(LocalDateTime.now());
		ex.setMessage(ad.getMessage());
		return new ResponseEntity<ExceptionsDetails>(ex,HttpStatus.BAD_GATEWAY);
		
		
	}
	
	@ExceptionHandler(CustomerExceptions.class)
	public ResponseEntity<ExceptionsDetails>  acustomerException(CustomerExceptions  ad, WebRequest we){
		
		ExceptionsDetails ex = new ExceptionsDetails();
		ex.setDetails(we.getDescription(false));
		ex.setLdt(LocalDateTime.now());
		ex.setMessage(ad.getMessage());
		return new ResponseEntity<ExceptionsDetails>(ex,HttpStatus.BAD_GATEWAY);
		
		
	}
	
	@ExceptionHandler(OrdresExceptions.class)
	public ResponseEntity<ExceptionsDetails>  acustomerException(OrdresExceptions  ad, WebRequest we){
		
		ExceptionsDetails ex = new ExceptionsDetails();
		ex.setDetails(we.getDescription(false));
		ex.setLdt(LocalDateTime.now());
		ex.setMessage(ad.getMessage());
		return new ResponseEntity<ExceptionsDetails>(ex,HttpStatus.BAD_GATEWAY);
		
		
	}
	@ExceptionHandler(ProductsException.class)
	public ResponseEntity<ExceptionsDetails>  acustomerException(ProductsException  ad, WebRequest we){
		
		ExceptionsDetails ex = new ExceptionsDetails();
		ex.setDetails(we.getDescription(false));
		ex.setLdt(LocalDateTime.now());
		ex.setMessage(ad.getMessage());
		return new ResponseEntity<ExceptionsDetails>(ex,HttpStatus.BAD_GATEWAY);
		
		
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ExceptionsDetails> mynotFoundHandler(NoHandlerFoundException ad,WebRequest we)  {

	
		ExceptionsDetails ex = new ExceptionsDetails();
		ex.setDetails(we.getDescription(false));
		ex.setLdt(LocalDateTime.now());
		ex.setMessage(ad.getMessage());
		return new ResponseEntity<ExceptionsDetails>(ex,HttpStatus.BAD_GATEWAY);
						
	}	
	
	

}
