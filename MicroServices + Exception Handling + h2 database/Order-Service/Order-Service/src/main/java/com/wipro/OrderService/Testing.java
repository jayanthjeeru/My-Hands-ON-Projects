package com.wipro.OrderService;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("order")
public class Testing {
	
	@Autowired
	private RestTemplate resttemplate;
	
	@GetMapping("getall")
	public List<Cart> getall(){
		
		Cart[] body =resttemplate.getForEntity("http://localhost:8081/cart/getall",Cart[].class).getBody();
		
		return Arrays.asList(body);
	}
	

}
