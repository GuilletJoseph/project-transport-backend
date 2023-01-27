package com.diginamic.transport.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.diginamic.transport.exceptions.TypeVNotFoundException;
import com.diginamic.transport.models.TypeV;
import com.diginamic.transport.repos.TypeVRepository;

@Service
public class TypeVService {

    @Autowired
    private TypeVRepository typeVRepo;  
    
    
    
	public TypeVService(TypeVRepository typeVRepo) {
		super();
		this.typeVRepo = typeVRepo;
	}

	 public TypeV addTypeV(TypeV typeV) {
	        return typeVRepo.save(typeV);
	    }

	    public List<TypeV> findAllTypeVs() {
	        return (List<TypeV>) typeVRepo.findAll();
	    }

	    public TypeV updateTypeV(TypeV typeV) {
	        return typeVRepo.save(typeV);
	    }

	    public TypeV findTypeVById(Long id) throws TypeVNotFoundException {
	        return typeVRepo.findTypeVById(id)
	                .orElseThrow(() -> new TypeVNotFoundException("TypeV de id " + id + " ete pas trouve"));
	    }

	    public void deleteTypeV(Long id){
	        typeVRepo.deleteById(id);
	    }
	}


