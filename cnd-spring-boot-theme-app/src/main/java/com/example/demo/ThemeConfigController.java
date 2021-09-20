package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RefreshScope
public class ThemeConfigController {
	


	@Value("${my.greeting: default}")
	private String greeting;
	
	@RequestMapping("/greeting")
	public String theme(){
		System.out.println("My Greeting:"+greeting);
		return greeting;
	}


}
