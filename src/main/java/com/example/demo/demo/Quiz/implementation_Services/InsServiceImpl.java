package com.example.demo.demo.Quiz.implementation_Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.demo.Quiz.model.Inscription;
import com.example.demo.demo.Quiz.repository.InsRepository;
import com.example.demo.demo.Quiz.service.InscriptionService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class InsServiceImpl implements InscriptionService {

	@Autowired
    private  InsRepository insRepository;

    public Inscription creer(Inscription inscription) {
        return insRepository.save(inscription);
    }

    public Inscription modifier(Integer id, Inscription inscription) {
        return insRepository.findById(id).map(ins -> {
            ins.setNom(inscription.getNom());
            ins.setPrenom(inscription.getPrenom());
            ins.setPassword(inscription.getPassword());
            return insRepository.save(ins);
        }).orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));
    }

    public String supprimer(Integer id) {
        insRepository.deleteById(id);
        return "Utilisateur supprimé avec succès";
    }
}
