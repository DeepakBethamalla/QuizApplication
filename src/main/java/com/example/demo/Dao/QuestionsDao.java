package com.example.demo.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.QuestionsEntity;

@Repository
public interface QuestionsDao extends JpaRepository<QuestionsEntity,Integer> {

	@Query(value = "SELECT * FROM questions WHERE questions.category = :category ORDER BY RAND() LIMIT :numQ", nativeQuery = true)

	List<QuestionsEntity> getQuestionsByRequirement(String category, int numQ);

	

}
