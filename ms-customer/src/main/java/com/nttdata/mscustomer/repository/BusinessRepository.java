package com.nttdata.mscustomer.repository;

import com.nttdata.mscustomer.model.Business;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BusinessRepository {

    Mono<Void> create(Business business);

    Flux<Business> findAll();

    Mono<Business> findById(String businessId);

    Mono<Business> update(Business business);
    
    Mono<Void> remove(String businessId);
}
