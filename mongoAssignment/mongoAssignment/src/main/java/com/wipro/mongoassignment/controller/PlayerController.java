package com.wipro.mongoassignment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.mongoassignment.model.Player;
import com.wipro.mongoassignment.service.PlayerService;

@RestController
public class PlayerController {

	@Autowired
	private PlayerService playerService; 
	
	@GetMapping
	public ResponseEntity<List<Player>> getAllPlayers(){
		
		return new ResponseEntity<List<Player>>(playerService.getAllPlayers(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Player> addPlayer(@RequestBody Player player){
		
		return new ResponseEntity<Player>(playerService.addPlayer(player),HttpStatus.OK);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Player> getPlayerById(@PathVariable("id") int id){
		
		Optional<Player> o=playerService.getPlayerById(id);
		
		if(o.isPresent())
		return new ResponseEntity<Player>(o.get(),HttpStatus.OK);
		
		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@PutMapping
	public ResponseEntity<Player> updatePlayer(@RequestBody Player player){
		
		return new ResponseEntity<Player>(playerService.updatePlayer(player),HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deletePlayerById(@PathVariable("id") int id){
		
		Optional<Player> o=playerService.getPlayerById(id);
		
		if(o.isPresent()) {
			playerService.deletePlayerById(id);
		return new ResponseEntity<String>("Player Deleted",HttpStatus.OK);
		}
		else
			return new ResponseEntity<String>("Player Not Found",HttpStatus.NOT_FOUND);
	}
	
}
