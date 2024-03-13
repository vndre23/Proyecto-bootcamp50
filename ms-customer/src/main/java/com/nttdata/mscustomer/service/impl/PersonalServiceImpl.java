package com.nttdata.mscustomer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.nttdata.mscustomer.model.Personal;
import com.nttdata.mscustomer.repository.PersonalRepository;
import com.nttdata.mscustomer.service.PersonalService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class PersonalServiceImpl implements PersonalService{

    @Autowired
    private PersonalRepository personalRepository;

    @Override
    public Flux<Personal> findAll() {
       return personalRepository.findAll();
    }

    @Override
    public Mono<Personal> findById(String id) {
        return personalRepository.findById(id);
    }

    @Override
    public Mono<Personal> save(Personal personal) {
        return personalRepository.save(personal);
    }

    @Override
    public Mono<Personal> update(String id, Personal personal) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Mono<Void> delete(String id) {
        return personalRepository.deleteById(id);
    }

}
