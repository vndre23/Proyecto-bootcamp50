package com.nttdata.mscustomer.repository;

import com.nttdata.mscustomer.model.Customer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerRepository {

    Mono<Void> create(Customer customer);

    Flux<Customer> findAll();

    // Mono<Customer> findById(String customerId);

    Mono<Customer> update(Customer customer);
    
    Mono<Void> remove(String customerId);
}
