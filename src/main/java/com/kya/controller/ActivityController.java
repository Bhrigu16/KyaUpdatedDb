package com.kya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kya.model.Activity;
import com.kya.repository.ActivityRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/")
public class ActivityController {

	@Autowired
	ActivityRepository activityRepository;
	
	@GetMapping("test")
	public String testapi() {
		return "Test Link";
	}

	@RequestMapping("/getactivities")
	public List<Activity> getActivity() {
		
		return activityRepository.findAll();
		
	}
}
