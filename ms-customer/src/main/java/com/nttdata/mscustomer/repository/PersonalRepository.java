package com.nttdata.mscustomer.repository;

import com.nttdata.mscustomer.model.Personal;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonalRepository {

    Mono<Void> create(Personal personal);

    Flux<Personal> findAll();

    Mono<Personal> findById(String personalId);

    Mono<Personal> update(Personal personal);
    
    Mono<Void> remove(String personalId);
}
