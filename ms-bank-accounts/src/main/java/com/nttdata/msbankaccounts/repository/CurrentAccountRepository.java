package com.nttdata.msbankaccounts.repository;

import com.nttdata.msbankaccounts.model.CurrentAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CurrentAccountRepository {

    Mono<Void> create(CurrentAccount currentAccount);

    Flux<CurrentAccount> findAll();

    Mono<CurrentAccount> findById(String currentAccountId);

    Mono<CurrentAccount> update(CurrentAccount currentAccount);
    
    Mono<Void> remove(String currentAccountId);
}
