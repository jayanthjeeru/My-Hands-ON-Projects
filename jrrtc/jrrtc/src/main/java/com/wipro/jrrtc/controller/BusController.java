package com.wipro.jrrtc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.jrrtc.model.Bus;
import com.wipro.jrrtc.service.BusService;

@RestController
public class BusController {

	@Autowired
	private BusService busService;
	
	@GetMapping("findbus/{from}/{to}")
	public List<Bus> findBus(@PathVariable String from,@PathVariable String to){
		
		System.out.println(from+" "+to);
		return busService.findBus(from, to);
	}
	
	@PostMapping("addbuss")
	public Bus addBus(@RequestBody Bus bus) {
		System.out.println(bus);
		return busService.addBus(bus);
	}
	
	@PutMapping("updatebuss")
	public Bus updateBus(@RequestBody Bus bus) {
		//System.out.println(bus);
		return busService.updateBus(bus);
	}
}
