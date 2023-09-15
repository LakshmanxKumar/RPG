package com.example.passwordgenrator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.passwordgenrator.model.Password;
import com.example.passwordgenrator.model.RequestPassword;
import com.example.passwordgenrator.services.RPGService;


@RestController
public class ReqController {
	
	@Autowired
	RPGService s1;
	
	@PostMapping("/post")
	public ResponseEntity<Password> getPassword(@RequestBody RequestPassword req){
		s1.setRPG(req);
		return new ResponseEntity<Password>(s1.getRPG(),HttpStatus.OK);
	}
		
	@GetMapping
	public ResponseEntity<RequestPassword> getPassword(){
		return new ResponseEntity<RequestPassword>(new RequestPassword(8,true,true,false,false),HttpStatus.OK);
	}
	
}
