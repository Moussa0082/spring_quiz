package com.example.demo.demo.Quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.demo.Quiz.model.Quiz;
import com.example.demo.demo.Quiz.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    @Autowired

    private QuizService quizService;

    @PostMapping("/create" )
    public Quiz create(@RequestBody Quiz quiz) {

        return  quizService.creer( quiz );
       
    }

     @PutMapping("/update/{id}" )
    public Quiz update(@PathVariable int id_Qz, @RequestBody Quiz quiz) {

        return  quizService.modifier(  id_Qz , quiz );
       
    }

      @DeleteMapping("/delete/{id}" )
    public String delete(@RequestBody int id_Qz  ) {
        return  quizService.supprimer( id_Qz);
       
    }

    
    
}
