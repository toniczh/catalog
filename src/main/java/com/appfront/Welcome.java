package com.appfront;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.appfront.model.Product;
import com.appfront.model.ProductRepository;

@RestController
@EnableAutoConfiguration
public class Welcome {
	@Autowired
	ProductRepository productRepo;
	@RequestMapping("/")
	public String home() {
		Product p = productRepo.findOne(1);
		String prodDesc = p.getProddesc();
		return "Here is Home for product: " + prodDesc;
	}
	//Once declared @RestController for the class, no JSON return needed
	@GetMapping(value="/{id}")
	public Product getProduct(@PathVariable Integer id) {
		Product p = productRepo.findOne(id);
		return p;
	}
	
	//Add product
	@ResponseStatus(HttpStatus.ACCEPTED)
	@PostMapping(value="/post")
	public Product createProduct(@RequestBody @Valid Product p) {
		return productRepo.save(p);
		//return p;
		
	}

}
