package com.appfront;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
