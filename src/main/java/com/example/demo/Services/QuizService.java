package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.QuestionsDao;
import com.example.demo.Dao.QuizDao;
import com.example.demo.Model.QuestionsEntity;
import com.example.demo.Model.QuestionsWrapper;
import com.example.demo.Model.QuizEntity;
import com.example.demo.Model.ResponeFromUserEntity;

@Service
public class QuizService {
	
	@Autowired
	QuizDao quizDao;
	@Autowired
	QuestionsDao questionsDao;

	public ResponseEntity<String> createQuiz(String category, int numQ, String title) {
		try {
			List<QuestionsEntity> questions = questionsDao.getQuestionsByRequirement(category,numQ);
			
			QuizEntity quiz = new QuizEntity();
			quiz.setTitle(title);
			quiz.setQuestionsEntity(questions);
			quizDao.save(quiz);
			return new ResponseEntity<>("Success",HttpStatus.CREATED);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>("Failed",HttpStatus.BAD_REQUEST);
	}

	public List<QuestionsWrapper> getQuizQuestions(int id) {
		
			Optional<QuizEntity> quiz =  quizDao.findById(id);
			List<QuestionsEntity> questionsFromDB = quiz.get().getQuestionsEntity();
			List<QuestionsWrapper> questionsToUser = new ArrayList<>();
			for(QuestionsEntity q:questionsFromDB) {
				QuestionsWrapper qw = new QuestionsWrapper(q.getId(),q.getQuestion(),q.getOption1(),q.getOption2(),q.getOption3(),q.getOption4());
				questionsToUser.add(qw);
			}
			return questionsToUser;
		
	}

	public Integer quizResult(int id, List<ResponeFromUserEntity> responses) {
		
			QuizEntity quiz = quizDao.findById(id).get();
			List<QuestionsEntity> questions = quiz.getQuestionsEntity();
			
			int rightAnswer=0;
			int   i=0;
			
			for(ResponeFromUserEntity response: responses){
				if(response.getResponse().equals(questions.get(i).getQuestion()));
					rightAnswer++;
					System.out.println(rightAnswer);
				i++;
			}
			return rightAnswer;	
	}

	
}
