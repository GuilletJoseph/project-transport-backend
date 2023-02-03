package com.diginamic.transport.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String identifiant;
    private String mdp;
    @OneToOne//(cascade = { CascadeType.ALL })
	@JoinColumn(name = "idProfil", referencedColumnName = "id")
    private Profil idProfil;
    private String nom;
    private String prenom;
    private String mail;
    private String tel;
    @OneToOne//(cascade = { CascadeType.ALL })
	@JoinColumn(name = "idVille", referencedColumnName = "id")
    private Ville idVille;
    private String adresse;
    private String imageUrl;
    
    @OneToMany(mappedBy = "idUtilisateur", cascade = { CascadeType.ALL })
    @JsonIgnoreProperties("idUtilisateur")
	private Set<Vehicule> vehicules = new HashSet<>();  
    
    
    @OneToMany(mappedBy = "idUtilisateur", cascade = { CascadeType.ALL })
    @JsonIgnoreProperties("idUtilisateur")
	private Set<Anonce> anonces = new HashSet<>();

	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Utilisateur(Long id, String identifiant, String mdp, Profil idProfil, String nom, String prenom, String mail,
			String tel, Ville idVille, String adresse, String imageUrl, Set<Vehicule> vehicules, Set<Anonce> anonces) {
		super();
		this.id = id;
		this.identifiant = identifiant;
		this.mdp = mdp;
		this.idProfil = idProfil;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.tel = tel;
		this.idVille = idVille;
		this.adresse = adresse;
		this.imageUrl = imageUrl;
		this.vehicules = vehicules;
		this.anonces = anonces;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public Profil getIdProfil() {
		return idProfil;
	}

	public void setIdProfil(Profil idProfil) {
		this.idProfil = idProfil;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Ville getIdVille() {
		return idVille;
	}

	public void setIdVille(Ville idVille) {
		this.idVille = idVille;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Set<Vehicule> getVehicules() {
		return vehicules;
	}

	public void setVehicules(Set<Vehicule> vehicules) {
		this.vehicules = vehicules;
	}

	public Set<Anonce> getAnonces() {
		return anonces;
	}

	public void setAnonces(Set<Anonce> anonces) {
		this.anonces = anonces;
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	}