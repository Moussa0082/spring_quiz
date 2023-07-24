package com.example.demo.demo.Quiz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.demo.Quiz.model.Inscription;

@Repository
public interface InsRepository extends JpaRepository<Inscription, Integer>{

}
