package com.example.demo.demo.Quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.demo.Quiz.model.Reponse;

public interface ReponseRepository extends JpaRepository<Reponse, Long>{
    
}
