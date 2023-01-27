package com.diginamic.transport.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.diginamic.transport.exceptions.VilleNotFoundException;
import com.diginamic.transport.models.Ville;
import com.diginamic.transport.repos.VilleRepository;

@Service
public class VilleService {

    @Autowired
    private VilleRepository villeRepo;  
    
    
    
	public VilleService(VilleRepository villeRepo) {
		super();
		this.villeRepo = villeRepo;
	}

	 public Ville addVille(Ville ville) {
	        return villeRepo.save(ville);
	    }

	    public List<Ville> findAllVilles() {
	        return (List<Ville>) villeRepo.findAll();
	    }

	    public Ville updateVille(Ville ville) {
	        return villeRepo.save(ville);
	    }

	    public Ville findVilleById(Long id) throws VilleNotFoundException {
	        return villeRepo.findVilleById(id)
	                .orElseThrow(() -> new VilleNotFoundException("Ville de id " + id + " ete pas trouve"));
	    }

	    public void deleteVille(Long id){
	        villeRepo.deleteById(id);
	    }
	}


