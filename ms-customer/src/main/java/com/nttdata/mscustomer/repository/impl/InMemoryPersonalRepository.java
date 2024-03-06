package com.nttdata.mscustomer.repository.impl;

import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Component;

import com.nttdata.mscustomer.model.Personal;
import com.nttdata.mscustomer.repository.PersonalRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class InMemoryPersonalRepository implements PersonalRepository{

    
    private final CopyOnWriteArrayList<Personal> ListPersonal = new CopyOnWriteArrayList<Personal>();

    @Override
    public Mono<Void> create(Personal personal) {
        return Mono.fromRunnable(() -> ListPersonal.add(personal));
    }

    @Override
    public Flux<Personal> findAll() {
        return Flux.fromIterable(ListPersonal);
    }

    @Override
    public Mono<Personal> findById(String customerId) {
        return Flux.fromIterable(ListPersonal)
            .filter(clientPersonal -> clientPersonal.getId().equalsIgnoreCase(customerId))
            .next();
    }

    @Override
    public Mono<Personal> update(Personal personal) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Mono<Void> remove(String customerId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

}
