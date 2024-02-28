package com.nttdata.bootcamp.clientpersonal.repository;


import com.nttdata.bootcamp.clientpersonal.model.ClientPersonal;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface ClientPersonalRepository {

    Mono<Void> create(ClientPersonal clientPersonal);

    Mono<ClientPersonal> findById(String clientPersonalId);

    Flux<ClientPersonal> findAll();

    Mono<ClientPersonal> update(ClientPersonal clientPersonal);

    Mono<ClientPersonal> change(ClientPersonal clientPersonal);

    Mono<Void> remove(String clientPersonalId);
}
