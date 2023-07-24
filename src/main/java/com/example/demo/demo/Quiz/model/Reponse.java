package com.example.demo.demo.Quiz.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Reponse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_R;

    @Column(nullable = false)
    private int score;   

    @ManyToOne
    private Inscription inscription;

    @OneToOne(mappedBy = "reponse")
    private Quiz quiz;

    @ManyToOne
    private Classement classement;
}
