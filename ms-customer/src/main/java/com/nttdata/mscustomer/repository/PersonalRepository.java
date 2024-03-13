package com.nttdata.mscustomer.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.nttdata.mscustomer.model.Personal;


public interface PersonalRepository extends ReactiveMongoRepository<Personal,String>{

}
