package com.nttdata.mscustomer.service;

import com.nttdata.mscustomer.model.Business;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BusinessService {

    Flux<Business> findAll();

    Mono<Business> findById(String id);

    Mono<Business> save(Business business);

    Mono<Business> update(String id, Business business);

    Mono<Void> delete(String id);
}
