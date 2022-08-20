package com.wipro.shopEasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.shopEasy.model.Seller;
import com.wipro.shopEasy.model.User;
import com.wipro.shopEasy.service.SellerService;

@RestController
@RequestMapping("seller")
@CrossOrigin
public class SellerController {

	@Autowired
	SellerService sellerService;
	
	@PostMapping("registerseller")
	public ResponseEntity<Seller> registerSeller(@RequestBody Seller seller) {
		
		return new ResponseEntity<Seller>(sellerService.registerSeller(seller),HttpStatus.CREATED);
		
	}
	
	@GetMapping("getsellerbyemail")
	public ResponseEntity<?> getSellerByEmail(@RequestParam String email){
		
		if(sellerService.getSellerByEmail(email)!=null)
			return new ResponseEntity<Seller>(sellerService.getSellerByEmail(email),HttpStatus.OK);
		else
			return new ResponseEntity<String>("Seller Not Found",HttpStatus.NOT_FOUND);
			
	}
	
	@GetMapping("getallsellers")
	public ResponseEntity<List<Seller>> getAllSellers(){
		
		return new ResponseEntity<List<Seller>>(sellerService.getAllSellers(),HttpStatus.FOUND);
	}
}
