package com.example.demo.demo.Quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.demo.Quiz.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer>{
    //  Question findByCategory(String category);   
}
