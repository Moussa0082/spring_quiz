package com.example.demo.demo.Quiz.service;

import com.example.demo.demo.Quiz.model.Quiz;

public interface QuizService {
    
      //Ajout
    Quiz creer(Quiz quiz);

    //Modifier
    Quiz modifier(int id_Qz,  Quiz  quiz);

    //Supprimer
    String supprimer(int id_Qz);
}
