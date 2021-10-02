package com.fatou.survey2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatou.survey2.model.Survey;
import com.fatou.survey2.service.SurveyService;

@RestController
public class SurveyController {
	
	@Autowired
	private SurveyService fatou;
	
	@GetMapping("/surveys")
	public List<Survey> retrieveAllSurvey(){
		return fatou.retrieveAllSurveys();
	}

}
