package com.diginamic.transport.repos;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.diginamic.transport.models.Profil;

public interface ProfilRepository extends CrudRepository<Profil, Long> {
	 Optional<Profil> findProfilById(Long id);
    
}
