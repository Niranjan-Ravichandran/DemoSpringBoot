package com.jan.core.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jan.core.model.Project;

@RestController
public class ProjectController {
	@GetMapping("/")
	public String get() {
		return "Succss";
	}
	
	@PostMapping(path="/postProject")
	public String getPostedProject(@RequestBody Project project) {
		return project.toString();
		
	}
}
