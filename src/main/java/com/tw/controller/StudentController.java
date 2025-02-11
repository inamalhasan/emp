package com.tw.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

	@PostMapping("/save")
	public String savedata() {
		return "save success!";
	}
	
	@GetMapping("/list")
	public List<String> listOfStudent() {
		
		return List.of("taha","rafe","minhaj");
	}
}
