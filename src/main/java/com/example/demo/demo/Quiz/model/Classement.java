package com.example.demo.demo.Quiz.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "classement")
public class Classement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_C;

    @Column(nullable = false)
    private int number;

    @OneToMany(mappedBy = "classement")
    List<Reponse> reponse;

    @OneToMany(mappedBy = "classement")
    List<Inscription> inscription;
}
