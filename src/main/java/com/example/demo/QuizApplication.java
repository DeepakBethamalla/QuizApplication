package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.demo.Questionscontroller", "com.example.demo.QuestionsService","/QuizApplication/src/main/java/com/example/demo/QuestionsEntity/QuestionsEntity.java","com.example.demo.QuestionsDAO"})
public class QuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
		System.out.println("hi");
	}

}
