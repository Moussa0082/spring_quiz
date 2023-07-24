package com.example.demo.demo.Quiz.service;

import com.example.demo.demo.Quiz.model.Inscription;

public interface InscriptionService {
    Inscription creer(Inscription inscription);

    Inscription modifier(Integer id, Inscription inscription);

    String supprimer(Integer id);
}
