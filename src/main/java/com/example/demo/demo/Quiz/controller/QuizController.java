package com.example.demo.demo.Quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.demo.Quiz.implementation_Services.QuizImpl;
import com.example.demo.demo.Quiz.model.Quiz;
import com.example.demo.demo.Quiz.repository.QuizRepository;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired
    private QuizImpl quizImpl;

    @Autowired
    QuizRepository quizRepository;

    @PostMapping("/create" )
    public Quiz create(@RequestBody Quiz quiz) {

        return  quizImpl.creer( quiz );
       
    }

     @PutMapping("/update/{id}" )
    public Quiz update(@PathVariable int id_Qz, @RequestBody Quiz quiz) {

        return  quizImpl.modifier(  id_Qz , quiz );
       
    }

      @DeleteMapping("/delete/{id}" )
    public String delete(@RequestBody int id_Qz  ) {
        return  quizImpl.supprimer( id_Qz);
       
    }


     @GetMapping("/all")
    public List<Quiz> getAllQuiz() {
        return quizImpl.getAllQuiz();
    } 

    
    
}
