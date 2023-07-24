package com.example.demo.demo.Quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.demo.Quiz.model.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long>{
    
}
