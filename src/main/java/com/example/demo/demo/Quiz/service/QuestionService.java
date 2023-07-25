package com.example.demo.demo.Quiz.service;

import com.example.demo.demo.Quiz.model.Question;

public interface QuestionService {
    //Ajout
    Question creer(Question question);

    //Modifier
    Question modifier(int id_Qs, Question question);

    //Supprimer
    String supprimer(int id_Qs);

}
