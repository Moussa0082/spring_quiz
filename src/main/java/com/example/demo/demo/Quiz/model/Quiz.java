package com.example.demo.demo.Quiz.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "quiz")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Qz;
            
    @Column(length = 150, nullable = false)
    private String titre_quiz;

    @ManyToOne
    private Inscription inscription;

    @JsonIgnoreProperties("quiz")
    @OneToMany
    List<Question> question;
   
 
    @jakarta.persistence.OneToOne
    private Reponse reponse;

    // @OneToMany(mappedBy = "quiz")
    // private List<Resultat> resultats;

    // @OneToMany(mappedBy  = "id_Qs", cascade = CascadeType.ALL)
    // private List<Question> questions;
    
}
