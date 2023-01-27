package com.diginamic.transport.repos;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.diginamic.transport.models.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation, Long> {
	 Optional<Reservation> findReservationById(Long id);
    
}
