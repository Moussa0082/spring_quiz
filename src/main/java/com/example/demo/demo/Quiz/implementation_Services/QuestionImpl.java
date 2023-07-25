package com.example.demo.demo.Quiz.implementation_Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.demo.Quiz.model.Question;
import com.example.demo.demo.Quiz.repository.QuestionRepository;
import com.example.demo.demo.Quiz.service.QuestionService;

@Service
public class QuestionImpl implements QuestionService {

    @Autowired
    QuestionRepository questionRepo;

    public QuestionImpl(QuestionRepository questionRepo){

        this.questionRepo = questionRepo;
    }

    //Liste des questions
     public List<Question> getAllQuestions() {
        return questionRepo.findAll();
    }

    @Override
    public Question creer(Question question) {
       return questionRepo.save(question);
    }

    @Override
    public Question modifier(int id_Qs, Question question) {
        return questionRepo.findById(id_Qs).map(ques -> {
            ques.setTitre_question(question.getTitre_question());
            ques.setOption1(question.getOption1());
            ques.setOption2(question.getOption2());
            ques.setOption3(question.getOption3());
            ques.setReponse(question.getReponse());
            ques.setCategory(question.getCategory());
            return questionRepo.save(ques);
        }).orElseThrow(()-> new RuntimeException("modifier avec succès"));
    }

    @Override
    public String supprimer(int id_Qs) {
      questionRepo.deleteById(id_Qs);
      return "Question supprimer";
    }
    
}
