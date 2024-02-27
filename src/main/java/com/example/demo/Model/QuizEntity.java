package com.example.demo.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="quiz")
public class QuizEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String title;
	@ManyToMany
	private List<QuestionsEntity> QuestionsEntity;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<QuestionsEntity> getQuestionsEntity() {
		return QuestionsEntity;
	}
	public void setQuestionsEntity(List<QuestionsEntity> questionsEntity) {
		QuestionsEntity = questionsEntity;
	}
	
	
}
