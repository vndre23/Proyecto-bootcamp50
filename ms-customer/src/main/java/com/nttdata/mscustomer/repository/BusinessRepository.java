package com.nttdata.mscustomer.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.nttdata.mscustomer.model.Business;

public interface BusinessRepository extends ReactiveMongoRepository<Business, String>{

    
}
