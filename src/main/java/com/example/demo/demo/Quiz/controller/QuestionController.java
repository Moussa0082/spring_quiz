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

import com.example.demo.demo.Quiz.model.Question;
import com.example.demo.demo.Quiz.repository.QuestionRepository;
import com.example.demo.demo.Quiz.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {
    
    @Autowired
    private QuestionService questionService;

    @Autowired
   private QuestionRepository questionRepository;

    @PostMapping("/create")
    public Question save(@RequestBody Question question){
        return questionService.creer(question);
    }

    @PutMapping("/update/{id}")
    public Question update(@PathVariable int id_Qs, @RequestBody Question question){
        return questionService.modifier (id_Qs, question);
    }

    @DeleteMapping("/delete/{id}")
    public Question delete(@RequestBody int id_Qs){
        return delete(id_Qs);
    }

    //Recuperer tous  les questions
    @GetMapping("/allQuestions")
    public List<Question> getAllQuestions(){
        return questionRepository.findAll();
    }


}
