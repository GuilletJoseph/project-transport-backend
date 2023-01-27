package com.diginamic.transport.repos;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.diginamic.transport.models.TypeV;

public interface TypeVRepository extends CrudRepository<TypeV, Long> {
	 Optional<TypeV> findTypeVById(Long id);
    
}
