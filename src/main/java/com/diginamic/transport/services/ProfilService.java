package com.diginamic.transport.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.diginamic.transport.exceptions.ProfilNotFoundException;
import com.diginamic.transport.models.Profil;
import com.diginamic.transport.repos.ProfilRepository;

@Service
public class ProfilService {

    @Autowired
    private ProfilRepository profilRepo;  
    
    
    
	public ProfilService(ProfilRepository profilRepo) {
		super();
		this.profilRepo = profilRepo;
	}

	 public Profil addProfil(Profil profil) {
	        return profilRepo.save(profil);
	    }

	    public List<Profil> findAllProfils() {
	        return (List<Profil>) profilRepo.findAll();
	    }

	    public Profil updateProfil(Profil profil) {
	        return profilRepo.save(profil);
	    }

	    public Profil findProfilById(Long id) throws ProfilNotFoundException {
	        return profilRepo.findProfilById(id)
	                .orElseThrow(() -> new ProfilNotFoundException("Profil de id " + id + " ete pas trouve"));
	    }

	    public void deleteProfil(Long id){
	        profilRepo.deleteById(id);
	    }
	}


