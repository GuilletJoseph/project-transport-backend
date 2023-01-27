package com.diginamic.transport.models;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Anonce implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 
    @ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "idUtilisateur")
	private Utilisateur  idUtilisateur;  
    @OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "idVehicule", referencedColumnName = "id")
	private Vehicule idVehicule;
    private LocalDate date;
    private String hDebut;
    private int nbPlace;
    @OneToOne(cascade = { CascadeType.ALL })
   	@JoinColumn(name = "idVilleDepart", referencedColumnName = "id")
    private Ville idVilleDepart;
    @OneToOne(cascade = { CascadeType.ALL })
   	@JoinColumn(name = "idVilleArrive", referencedColumnName = "id")
    private Ville idVilleArrive;
	public Anonce() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Anonce(Long id, Utilisateur idUtilisateur, Vehicule idVehicule, LocalDate date, String hDebut, int nbPlace,
			Ville idVilleDepart, Ville idVilleArrive) {
		super();
		this.id = id;
		this.idUtilisateur = idUtilisateur;
		this.idVehicule = idVehicule;
		this.date = date;
		this.hDebut = hDebut;
		this.nbPlace = nbPlace;
		this.idVilleDepart = idVilleDepart;
		this.idVilleArrive = idVilleArrive;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Utilisateur getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(Utilisateur idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public Vehicule getIdVehicule() {
		return idVehicule;
	}
	public void setIdVehicule(Vehicule idVehicule) {
		this.idVehicule = idVehicule;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String gethDebut() {
		return hDebut;
	}
	public void sethDebut(String hDebut) {
		this.hDebut = hDebut;
	}
	public int getNbPlace() {
		return nbPlace;
	}
	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}
	public Ville getIdVilleDepart() {
		return idVilleDepart;
	}
	public void setIdVilleDepart(Ville idVilleDepart) {
		this.idVilleDepart = idVilleDepart;
	}
	public Ville getIdVilleArrive() {
		return idVilleArrive;
	}
	public void setIdVilleArrive(Ville idVilleArrive) {
		this.idVilleArrive = idVilleArrive;
	}
    
    
    
    
    
    
}
