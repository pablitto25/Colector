package com.latamly.colector.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.latamly.colector.models.C_Tc_ChileModel;

@Repository
public interface C_Tc_ChileRepository extends CrudRepository<C_Tc_ChileModel, Long>{
    
}
