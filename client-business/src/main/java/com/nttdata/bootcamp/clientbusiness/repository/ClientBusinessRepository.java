package com.nttdata.bootcamp.clientbusiness.repository;

import com.nttdata.bootcamp.clientbusiness.model.ClientBusiness;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientBusinessRepository {

    Mono<Void> create(ClientBusiness clientBusiness);

    Mono<ClientBusiness> findById(String clientBusinessId);

    Flux<ClientBusiness> findAll();

    Mono<ClientBusiness> update(ClientBusiness clientBusiness);

    Mono<ClientBusiness> change(ClientBusiness clientBusiness);

    Mono<Void> remove(String clientBusinessId);
}
