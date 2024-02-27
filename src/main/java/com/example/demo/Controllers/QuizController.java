package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.QuestionsWrapper;
import com.example.demo.Model.ResponeFromUserEntity;
import com.example.demo.Services.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	@Autowired
	QuizService quizService;

	@PostMapping("/create")
	public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ,@RequestParam String title){
		
		return quizService.createQuiz(category,numQ,title);
	}
	@GetMapping("/getQuiz/{id}")
	public List<QuestionsWrapper> getQuizQuestions(@PathVariable int id){
		return quizService.getQuizQuestions(id);
	}
	@PostMapping("/submit/{id}")
	public Integer submitQuizAnswer(@PathVariable int id,@RequestBody List<ResponeFromUserEntity> responses) {
		return quizService.quizResult(id,responses);
	}
	
}
