package com.example.demo.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Dao.QuestionsDao;
import com.example.demo.Model.QuestionsEntity;

@Service
public class QuestionsService {
	
	@Autowired
	QuestionsDao questionsDao;
	
	public ResponseEntity<List<QuestionsEntity>> getAllQuestions(){
		try {
			return new ResponseEntity<>(questionsDao.findAll(),HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
		
	}
	
	public QuestionsEntity addQuestion(@RequestBody QuestionsEntity question){
		QuestionsEntity added =  questionsDao.save(question);
		 return added;
	}
	
	public Optional<QuestionsEntity> getById(int id) {
		if(questionsDao.existsById(id)) {
			Optional<QuestionsEntity> data = questionsDao.findById(id);
			 return data;
		}else {
			return null;
		}
				 
	}
	
	public String deleteById(int id) {
		
		if(questionsDao.existsById(id)) {
			questionsDao.deleteById(id);;
			return "Deleted";
		}
		else {
			return "Id not found";
		}
	}
	
}

