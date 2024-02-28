package com.nttdata.bootcamp.clientpersonal.repository.impl;

import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Component;

import com.nttdata.bootcamp.clientpersonal.model.ClientPersonal;
import com.nttdata.bootcamp.clientpersonal.repository.ClientPersonalRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class InMemoryCustomerRepository implements ClientPersonalRepository{

    private final CopyOnWriteArrayList<ClientPersonal> clientsPersonal = new CopyOnWriteArrayList<>();

    @Override
    public Mono<Void> create(ClientPersonal clientPersonal) {
        return Mono.fromRunnable(() -> clientsPersonal.add(clientPersonal));
    }

    @Override
    public Mono<ClientPersonal> findById(String clientPersonalId) {
        return Flux.fromIterable(clientsPersonal)
            .filter(clientPersonal -> clientPersonal.getId().equalsIgnoreCase(clientPersonalId))
            .next();
    }

    @Override
    public Flux<ClientPersonal> findAll() {
        return Flux.fromIterable(clientsPersonal);
    }

    @Override
    public Mono<ClientPersonal> update(ClientPersonal clientPersonal) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Mono<ClientPersonal> change(ClientPersonal clientPersonal) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'change'");
    }

    @Override
    public Mono<Void> remove(String clientPersonalId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

}
