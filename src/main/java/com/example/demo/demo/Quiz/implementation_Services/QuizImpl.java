package com.example.demo.demo.Quiz.implementation_Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.demo.Quiz.model.Quiz;
import com.example.demo.demo.Quiz.repository.QuizRepository;
import com.example.demo.demo.Quiz.service.QuizService;

@Service
public class QuizImpl implements QuizService {
@Autowired
private QuizRepository quizRepository;

    @Override
    public Quiz creer(Quiz quiz) {
        return  quizRepository.save( quiz );
       
    }

    @Override
    public Quiz modifier(int id_Qz, Quiz quiz) {
        return quizRepository.findById(id_Qz).map(ins -> {
            ins.setTitre_quiz(quiz.getTitre_quiz());
          
            return quizRepository.save(ins);
        }).orElseThrow(() -> new RuntimeException("Quiz modifier avec succès "));
    }

    @Override
    public String supprimer(int id_Qz) {
       quizRepository.deleteById(id_Qz);
       return "Quiz supprimer avec succès";
    }
    
}
