package com.fatou.survey2.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fatou.survey2.model.Question;
import com.fatou.survey2.model.Survey;

@Component
public class SurveyService {
	private static List<Survey> surveys = new ArrayList<>();
	static {
		Question question1 = new Question("Question1","Best Computer","MakBook pro", Arrays.asList(
				"hp","MakBook pro","Samsung","Acer"));
		Question question2 = new Question("Question2",
				"Most efficient Computer brand", "MakBook pro", Arrays.asList(
						"Hp", "MakBook pro","Acer","Samsung"));	
		Question question3 = new Question("Question3",
				"The cheapest Computer Brand","Acer", Arrays.asList(
						"Hp","Acer","MakBook pro","Samsung"));
		Question question4 = new Question("Question4",
				"The most expensive Computer brand", "MakBook pro", Arrays
				.asList("Hp","MakBook pro","Samsung","Acer")); 
		
		List<Question> questions = new ArrayList<>(Arrays.asList(question1,
				question2,question3,question4));
		
		Survey survey1 = new Survey("Survey1", "My favorite Survey",
				"Description of the Survey", questions);
		Survey survey2 = new Survey("Survey2", "My favorite Survey",
				"Description of the Survey", questions);
		Survey survey3 = new Survey("Survey3", "My favorite Survey",
				"Description of the Survey", questions);
		Survey survey4 = new Survey("Survey4", "My favorite Survey",
				"Description of the Survey", questions);
		
		surveys.add(survey1);
		surveys.add(survey2);
		surveys.add(survey3);
		surveys.add(survey4);
	}
		public List<Survey> retrieveAllSurveys() {
			return surveys;
		}
		public Survey retrieveSurvey(String surveyId) {
			for(Survey survey : surveys) {
				if(survey.getId().equals(surveyId)) {
					return survey;
			}
		}
			return null;
						      
		}
		public List<Question> retrieveQuestions(String surveyId){
			Survey survey = retrieveSurvey(surveyId);
			
			if(survey == null) {
				return null;
			}
			return survey.getQuestions();
		}
		public Question retieveQuestion(String surveyId, String questionId) {
			Survey survey = retrieveSurvey(surveyId);
			
			if(survey == null) {
				return null;
			}
			for(Question question : survey.getQuestions()) {
				return question;
			}
			return null;
			
			
			
		}
	}


