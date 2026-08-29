package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Resource;
import com.example.demo.service.ResourceService;

@RestController
public class ResourceController {

	@Autowired
	ResourceService resService;
	
	@PostMapping("/saveResource")
	public String saveResource(@RequestBody Resource res)
	{
		 Resource savedResource = resService.saveResource(res);

		    if (savedResource.getId() != null) {
		        return "Resource Saved Successfully. ID: " + savedResource.getId();
		    }

		    return "Resource Not Saved";	
	}
	@GetMapping("/viewResource")
	public List<Resource> getResource() {
	    return resService.getResource();
	}
}
