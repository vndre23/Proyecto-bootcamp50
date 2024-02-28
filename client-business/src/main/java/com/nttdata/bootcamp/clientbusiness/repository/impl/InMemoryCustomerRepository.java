package com.nttdata.bootcamp.clientbusiness.repository.impl;

import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Component;

import com.nttdata.bootcamp.clientbusiness.model.ClientBusiness;
import com.nttdata.bootcamp.clientbusiness.repository.ClientBusinessRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class InMemoryCustomerRepository implements ClientBusinessRepository{

    private final CopyOnWriteArrayList<ClientBusiness> clientsBusiness = new CopyOnWriteArrayList<>();

    @Override
    public Mono<Void> create(ClientBusiness clientBusiness) {
        return Mono.fromRunnable(() -> clientsBusiness.add(clientBusiness));
    }

    @Override
    public Mono<ClientBusiness> findById(String clientBusinessId) {
        return Flux.fromIterable(clientsBusiness)
            .filter(clientBusiness -> clientBusiness.getId().equalsIgnoreCase(clientBusinessId))
            .next();
    }

    @Override
    public Flux<ClientBusiness> findAll() {
        return Flux.fromIterable(clientsBusiness);
    }

    @Override
    public Mono<ClientBusiness> update(ClientBusiness clientBusiness) {
        return Flux.fromIterable(clientsBusiness)
            .filter(clientBusinessFilter -> clientBusinessFilter.getId().equalsIgnoreCase(clientBusiness.getId()))
            .map(clientBusinessUpdate -> {
                clientBusinessUpdate.setAddress(clientBusiness.getAddress());
                clientBusinessUpdate.setBusinessName(clientBusiness.getBusinessName());
                clientBusinessUpdate.setEmail(clientBusiness.getEmail());
                clientBusinessUpdate.setPhone(clientBusiness.getPhone());
                return clientBusiness;
            }).next();
    }

    @Override
    public Mono<ClientBusiness> change(ClientBusiness clientBusiness) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'change'");
    }

    @Override
    public Mono<Void> remove(String clientBusinessId) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

}
