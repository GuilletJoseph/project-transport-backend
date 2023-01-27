package com.diginamic.transport.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.diginamic.transport.exceptions.BoiteNotFoundException;
import com.diginamic.transport.models.Boite;
import com.diginamic.transport.repos.BoiteRepository;

@Service
public class BoiteService {

    @Autowired
    private BoiteRepository boiteRepo;  
    
    
    
	public BoiteService(BoiteRepository boiteRepo) {
		super();
		this.boiteRepo = boiteRepo;
	}

	 public Boite addBoite(Boite boite) {
	        return boiteRepo.save(boite);
	    }

	    public List<Boite> findAllBoites() {
	        return (List<Boite>) boiteRepo.findAll();
	    }

	    public Boite updateBoite(Boite boite) {
	        return boiteRepo.save(boite);
	    }

	    public Boite findBoiteById(Long id) throws BoiteNotFoundException {
	        return boiteRepo.findBoiteById(id)
	                .orElseThrow(() -> new BoiteNotFoundException("Boite de id " + id + " ete pas trouve"));
	    }

	    public void deleteBoite(Long id){
	        boiteRepo.deleteById(id);
	    }
	}


