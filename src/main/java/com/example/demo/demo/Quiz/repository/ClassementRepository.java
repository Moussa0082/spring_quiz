package com.example.demo.demo.Quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.demo.Quiz.model.Classement;

public interface ClassementRepository  extends JpaRepository<Classement, Long>{
    
}
