package com.example.demo.demo.Quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.demo.Quiz.implementation_Services.InsServiceImpl;
import com.example.demo.demo.Quiz.model.Inscription;
import com.example.demo.demo.Quiz.repository.InsRepository;

import org.springframework.web.bind.annotation.GetMapping;




@RestController
@RequestMapping("/inscription")
public class InsController {

	@Autowired
    private InsServiceImpl insServiceImpl;

   /* @Autowired
    public InsController(InscriptionService insService) {
        this.insService = insService;
    }*/
    @Autowired
    public InsController(InsServiceImpl insServiceImpl) {
        this.insServiceImpl = insServiceImpl;
    }

    @PostMapping("/create")
    public Inscription create(@RequestBody  Inscription inscription) {
        return insServiceImpl.creer(inscription);
    }

    @PutMapping("/update/{id}")
    public Inscription update(@PathVariable Integer id, @RequestBody Inscription inscription) {
        return insServiceImpl.modifier(id, inscription);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        return insServiceImpl.supprimer(id);
    }

    
    @GetMapping("/all")
    public List<Inscription> getAllUsers() {
        return insServiceImpl.getAllUsers();
    }
   
    @Autowired
     private  InsRepository insRepository;

    @Autowired
    public InsController(InsRepository insRepository) {
        this.insRepository = insRepository;
    }

    @PostMapping("/connexion")
    public ResponseEntity<String> seConnecter(@RequestBody Inscription inscription) {
        // Récupérer les informations d'authentification du LoginRequest
        String nom = inscription.getNom();
        // String prenom = inscription.getPrenom();
        String passwords = inscription.getPassword();

        // Rechercher l'inscription par nom d'utilisateur dans la base de données
        Inscription inscriptions = insRepository.findByNom(nom);

        // Vérifier si l'inscription existe et si le mot de passe est correct
        if (inscriptions != null && inscriptions.getPassword().equals(passwords)) {
            return new ResponseEntity<>("Connexion réussie !", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Nom d'utilisateur ou mot de passe incorrect.", HttpStatus.UNAUTHORIZED);
        }
    }
    
}
