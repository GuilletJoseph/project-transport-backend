package com.diginamic.transport.repos;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.diginamic.transport.models.Ville;

public interface VilleRepository extends CrudRepository<Ville, Long> {
	 Optional<Ville> findVilleById(Long id);
    
}
