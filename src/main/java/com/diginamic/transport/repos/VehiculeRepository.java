package com.diginamic.transport.repos;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.diginamic.transport.models.Vehicule;

public interface VehiculeRepository extends CrudRepository<Vehicule, Long> {
	 Optional<Vehicule> findVehiculeById(Long id);
    
}