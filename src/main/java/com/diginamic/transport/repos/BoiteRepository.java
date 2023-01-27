package com.diginamic.transport.repos;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.diginamic.transport.models.Boite;

public interface BoiteRepository extends CrudRepository<Boite, Long> {
	 Optional<Boite> findBoiteById(Long id);
    
}
