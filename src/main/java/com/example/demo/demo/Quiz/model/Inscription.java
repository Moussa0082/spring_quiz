package com.example.demo.demo.Quiz.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name="inscription")
public class Inscription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 150)
	private String nom;
	
	@Column(length = 150)
	private String prenom;
	
	@Column(length = 150)
	private String password;
	
	@JsonIgnoreProperties("inscription")
	@OneToMany(mappedBy = "inscription")
    private List<Quiz> quiz;

	@JsonIgnoreProperties("inscription")
	@OneToMany(mappedBy = "inscription")
    private List<Reponse> reponse;

	@JsonIgnoreProperties("inscription")
	@ManyToOne
	private Classement classement;




//constructor
	
	
	public Inscription(Integer id, String nom, String prenom, String password) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.password = password;
}
	
	public Inscription() {
	super();
}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
