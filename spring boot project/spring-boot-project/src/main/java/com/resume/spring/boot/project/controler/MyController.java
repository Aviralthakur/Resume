package com.resume.spring.boot.project.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.resume.spring.boot.project.entity.Detail;

import com.resume.spring.boot.project.service.Detailservice;

@RestController
public class MyController {

	@Autowired
	private Detailservice detailservice;

	
	//Modify the user personal detail
	@PostMapping("/detail")
	@ResponseBody
	@CrossOrigin
	public String  editDetail(@RequestBody Detail data )
	{
		return this.detailservice.editDetail(data);
	}
	
	//Get user detail
	@GetMapping("/detail")
	@CrossOrigin
	public Detail getDetail()
	{
		return this.detailservice.getDetail();
	}
	
	
}
