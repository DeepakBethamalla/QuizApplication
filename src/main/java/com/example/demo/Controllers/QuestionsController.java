package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.QuestionsEntity;
import com.example.demo.Services.QuestionsService;

@RestController
@RequestMapping("/")
public class QuestionsController {
	
	@Autowired 
	QuestionsService questionsService;
	
	@GetMapping("/allquestions")
	public ResponseEntity<List<QuestionsEntity>> getAllQuestions(){
		return questionsService.getAllQuestions() ;
	}
	
	@PostMapping("/addquestions")
	public QuestionsEntity addQuestion(@RequestBody QuestionsEntity question){
		QuestionsEntity data= questionsService.addQuestion(question) ;
		return data;	
	}
	@GetMapping("/allquestions/{id}")
	public Optional<QuestionsEntity> getById(@PathVariable int id) {
		System.out.println(id);
		return questionsService.getById(id);
		
	}
	@GetMapping("/allquestions/delete/{id}")
	public String deleteById(@PathVariable int id) {
		
		return questionsService.deleteById(id);
	}
}




