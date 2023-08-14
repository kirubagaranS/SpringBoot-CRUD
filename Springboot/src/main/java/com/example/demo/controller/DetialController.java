package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Detial;
import com.example.demo.service.DetialService;


@RestController
public class DetialController {
	
	@Autowired
	private DetialService detialservice;
	
	@RequestMapping("/detials")
	public List<Detial> getAllDetials()
	{
		return detialservice.getAllDetials();
	}
	
	@RequestMapping(method= RequestMethod.POST, value="/detials")
	public void addDetials(@RequestBody Detial detial)
	{
		detialservice.addDetials(detial);
	}
	
	@RequestMapping(method= RequestMethod.PUT, value="/detials/{bid}")
	public void updateDetials(@PathVariable String sno,@RequestBody Detial detial)
	{
		detialservice.updateDetials(sno,detial);
	}
	
	@RequestMapping(method= RequestMethod.DELETE, value="/detials/{sno}")
	public void deleteDetials(@PathVariable String sno)
	{
		detialservice.deleteDetials(sno);
	}
}
