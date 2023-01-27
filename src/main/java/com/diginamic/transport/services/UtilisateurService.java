package com.diginamic.transport.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.diginamic.transport.exceptions.UtilisateurNotFoundException;
import com.diginamic.transport.models.Utilisateur;
import com.diginamic.transport.repos.UtilisateurRepository;

@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepo;  
    
    
    
	public UtilisateurService(UtilisateurRepository utilisateurRepo) {
		super();
		this.utilisateurRepo = utilisateurRepo;
	}

	 public Utilisateur addUtilisateur(Utilisateur utilisateur) {
	        return utilisateurRepo.save(utilisateur);
	    }

	    public List<Utilisateur> findAllUtilisateurs() {
	        return (List<Utilisateur>) utilisateurRepo.findAll();
	    }

	    public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
	        return utilisateurRepo.save(utilisateur);
	    }

	    public Utilisateur findUtilisateurById(Long id) throws UtilisateurNotFoundException {
	        return utilisateurRepo.findUtilisateurById(id)
	                .orElseThrow(() -> new UtilisateurNotFoundException("Utilisateur de id " + id + " ete pas trouve"));
	    }

	    public void deleteUtilisateur(Long id){
	        utilisateurRepo.deleteById(id);
	    }
	}


