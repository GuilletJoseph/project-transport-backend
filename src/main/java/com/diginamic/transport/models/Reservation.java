package com.diginamic.transport.models;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

	
	
	@Entity
	public class Reservation implements Serializable {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long id; 
	    @ManyToOne(cascade = { CascadeType.ALL })
		@JoinColumn(name = "idReservant")
		private Utilisateur  idReservant; 
	    @ManyToOne(cascade = { CascadeType.ALL })
		@JoinColumn(name = "idAnonce")
		private Anonce  idAnonce;
		public Reservation() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Reservation(Long id, Utilisateur idReservant, Anonce idAnonce) {
			super();
			this.id = id;
			this.idReservant = idReservant;
			this.idAnonce = idAnonce;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Utilisateur getIdReservant() {
			return idReservant;
		}
		public void setIdReservant(Utilisateur idReservant) {
			this.idReservant = idReservant;
		}
		public Anonce getIdAnonce() {
			return idAnonce;
		}
		public void setIdAnonce(Anonce idAnonce) {
			this.idAnonce = idAnonce;
		} 
	    
}
