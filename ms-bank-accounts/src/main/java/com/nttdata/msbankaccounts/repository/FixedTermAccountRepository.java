package com.nttdata.msbankaccounts.repository;

import com.nttdata.msbankaccounts.model.FixedTermAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface FixedTermAccountRepository {

    Mono<Void> create(FixedTermAccount fixedTermAccount);

    Flux<FixedTermAccount> findAll();

    Mono<FixedTermAccount> findById(String fixedTermAccountId);

    Mono<FixedTermAccount> update(FixedTermAccount fixedTermAccount);
    
    Mono<Void> remove(String fixedTermAccountId);
}
