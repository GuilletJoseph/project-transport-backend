package com.diginamic.transport.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.diginamic.transport.exceptions.ReservationNotFoundException;
import com.diginamic.transport.models.Reservation;
import com.diginamic.transport.repos.ReservationRepository;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepo;  
    
    
    
	public ReservationService(ReservationRepository reservationRepo) {
		super();
		this.reservationRepo = reservationRepo;
	}

	 public Reservation addReservation(Reservation reservation) {
	        return reservationRepo.save(reservation);
	    }

	    public List<Reservation> findAllReservations() {
	        return (List<Reservation>) reservationRepo.findAll();
	    }

	    public Reservation updateReservation(Reservation reservation) {
	        return reservationRepo.save(reservation);
	    }

	    public Reservation findReservationById(Long id) throws ReservationNotFoundException {
	        return reservationRepo.findReservationById(id)
	                .orElseThrow(() -> new ReservationNotFoundException("Reservation de id " + id + " ete pas trouve"));
	    }

	    public void deleteReservation(Long id){
	        reservationRepo.deleteById(id);
	    }
	}


