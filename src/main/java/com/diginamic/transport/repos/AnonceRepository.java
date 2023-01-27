package com.diginamic.transport.repos;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.diginamic.transport.models.Anonce;

public interface AnonceRepository extends CrudRepository<Anonce, Long> {
	 Optional<Anonce> findAnonceById(Long id);
    
}
