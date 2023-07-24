package com.example.demo.demo.Quiz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Qs;

    @Column(length = 200, nullable = false)
    private String titre_question;
  
    @Column(length = 200, nullable = false)
    private String option1;

    @Column(length = 200, nullable = false)
    private String option2;

    @Column(length = 200, nullable = false)
    private String option3;

    @Column(length = 150, nullable = false)
    private String reponse;

    @Column(length = 50, nullable = false)
    private String category; 

     @ManyToOne
    private Quiz quiz;
    
    

}
