package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Customer;
import com.example.repository.CustomerRepository;

@Controller
public class ApplicationController {
	
	@Autowired
	CustomerRepository repo;

	@RequestMapping("/")
	public String display()
	{
		return "connect";
	}
	
	@RequestMapping("save")
	public String getDetails(Customer customer)
	{
		repo.save(customer);
		return "connect";
	}
	
	@PostMapping("postdetails")
	public String viewDetails(@RequestParam("first_name") String first,
							  ModelMap modelmap)
	{
		modelmap.put("first_name", first);
		return "secondpage";
	}
}
