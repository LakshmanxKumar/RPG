package com.example.passwordgenrator.services;

import org.springframework.stereotype.Service;
import com.example.passwordgenrator.model.Password;
import com.example.passwordgenrator.model.RequestPassword;

@Service
public class RPGService {
	RPG r1= new RPG();
	public RPGService() {}
	public RPGService(RPG r1) {
		this.r1=r1;
	}
	public void setR1(RPG r1) {
		this.r1= r1;
	}
	
	public RPG getR1() {
		return r1;
	}
	
	// RPG needs the data from RequestPassword
	public void setRPG(RequestPassword req){
		r1.setCapitalsRequired(req.upperCase);
		r1.setLength(req.length);
		r1.setNumbersRequired(req.numbers);
		r1.setSmallLettersRequired(req.lowerCase);
		r1.setSpecialCharacterRequired(req.specialCase);
		
	}
	
	public Password getRPG() {
		return new Password(r1.generate());
	}
		
}
