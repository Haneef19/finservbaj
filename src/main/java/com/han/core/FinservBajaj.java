package com.han.core;

import java.util.LinkedList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.han.core.mods.Request;
import com.han.core.mods.Response;

@RestController
@SpringBootApplication
public class FinservBajaj {

	public static void main(String[] args) {
		SpringApplication.run(FinservBajaj.class, args);
	}
	
	@PostMapping(path = "bfhl")
	public Response getData(@RequestBody Request req) {
		
		List<String> numbers = new LinkedList<>();
		List<String> alphabets = new LinkedList<>();
		
		for(String s : req.getData()) {
			
			try{
				Integer.parseInt(s);
				numbers.add(s);
			}catch(Exception e) {
				alphabets.add(s);
			}
		}
		
		Response s = new Response();
		s.setIsSuccess(true);
		s.setUserId("haneef96");
		s.setEmail("96haneef@gmail.com");
		s.setRollNumber("haneef123");
		s.setNumbers(numbers);
		s.setAlphabets(alphabets);
		
		return s;
	}


}
