package com.nttdata.mscustomer.service;

import com.nttdata.mscustomer.model.Personal;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonalService {

    Flux<Personal> findAll();

    Mono<Personal> findById(String id);

    Mono<Personal> save(Personal personal);

    Mono<Personal> update(String id, Personal personal);

    Mono<Void> delete(String id);
}
