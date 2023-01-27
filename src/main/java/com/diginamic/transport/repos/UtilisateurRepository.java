package com.diginamic.transport.repos;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.diginamic.transport.models.Utilisateur;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long> {
	 Optional<Utilisateur> findUtilisateurById(Long id);
    
}
