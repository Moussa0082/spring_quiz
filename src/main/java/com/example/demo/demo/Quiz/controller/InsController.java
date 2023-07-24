package com.example.demo.demo.Quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.demo.Quiz.model.Inscription;
import com.example.demo.demo.Quiz.service.InscriptionService;



@RestController
@RequestMapping("/inscription")
public class InsController {

	@Autowired
    private InscriptionService insService;

   /* @Autowired
    public InsController(InscriptionService insService) {
        this.insService = insService;
    }*/

    @PostMapping("/create")
    public Inscription create(@RequestBody  Inscription inscription) {
        return insService.creer(inscription);
    }

    @PutMapping("/update/{id}")
    public Inscription update(@PathVariable Integer id, @RequestBody Inscription inscription) {
        return insService.modifier(id, inscription);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        return insService.supprimer(id);
    }
}
