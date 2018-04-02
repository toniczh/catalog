package com.appfront;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Career {
	@RequestMapping("/career")
	public String careerPage() {
		return("Welcome to career page");
	}

}
