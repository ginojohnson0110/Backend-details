package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173/")
@RestController
public class Registrationcontroller {
	@Autowired
	private RegistrationRepo repo;
	@PostMapping("/post")
	public   Registrationdetails postdata(@RequestBody Registrationdetails r) 
	{
		System.out.println(r);
	    return repo.save(r);
	}
	@GetMapping("/get")
	public List<Registrationdetails> getdata()
	{
	    return repo.findAll(); 
	}
}
