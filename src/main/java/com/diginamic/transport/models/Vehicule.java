package com.diginamic.transport.models;


import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
public class Vehicule implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToOne(cascade = { CascadeType.ALL })
   	@JoinColumn(name = "idTypeV", referencedColumnName = "id")
    private TypeV idTypeV;
    private int nbPlace;
    @OneToOne(cascade = { CascadeType.ALL })
   	@JoinColumn(name = "idBoite", referencedColumnName = "id")
    private Boite idBoite;
    private String imageUrl;
    private String immatriculation;
    @ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "idUtilisateur")
    @JsonIgnoreProperties("vehicules")
    private Utilisateur idUtilisateur;
    
    
    public Vehicule() {}
	public Vehicule(Long id, String name, TypeV idTypeV, int nbPlace, Boite idBoite, String imageUrl,
			String immatriculation, Utilisateur idUtilisateur) {
		super();
		this.id = id;
		this.name = name;
		this.idTypeV = idTypeV;
		this.nbPlace = nbPlace;
		this.idBoite = idBoite;
		this.imageUrl = imageUrl;
		this.immatriculation = immatriculation;
		this.idUtilisateur = idUtilisateur;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TypeV getIdTypeV() {
		return idTypeV;
	}
	public void setIdTypeV(TypeV idTypeV) {
		this.idTypeV = idTypeV;
	}
	public int getNbPlace() {
		return nbPlace;
	}
	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}
	public Boite getIdBoite() {
		return idBoite;
	}
	public void setIdBoite(Boite idBoite) {
		this.idBoite = idBoite;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public Utilisateur getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(Utilisateur idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	
    
    
}