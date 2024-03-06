package com.nttdata.msbankaccounts.repository;

import com.nttdata.msbankaccounts.model.SavingAccount;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface SavingAccountRepository {

    Mono<Void> create(SavingAccount savingAccount);

    Flux<SavingAccount> findAll();

    Mono<SavingAccount> findById(String savingAccountId);

    Mono<SavingAccount> update(SavingAccount savingAccount);
    
    Mono<Void> remove(String savingAccountId);
}
