package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Resource;
import com.example.demo.repository.ResourceRepository;


@Service("resService")
public class ResourceService {

	@Autowired
	ResourceRepository resRepo;
	
	public Resource saveResource(Resource res) {
		// TODO Auto-generated method stub
		return resRepo.save(res);
	}

	public List<Resource> getResource() {
		// TODO Auto-generated method stub
		return resRepo.findAll();
	}

	
}
