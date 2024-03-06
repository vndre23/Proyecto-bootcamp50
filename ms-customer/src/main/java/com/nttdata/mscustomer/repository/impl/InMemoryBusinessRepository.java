package com.nttdata.mscustomer.repository.impl;

import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Component;

import com.nttdata.mscustomer.model.Business;
import com.nttdata.mscustomer.repository.BusinessRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class InMemoryBusinessRepository implements BusinessRepository{

    private final CopyOnWriteArrayList<Business> ListBusiness = new CopyOnWriteArrayList<>();

    @Override
    public Mono<Void> create(Business business) {
        return Mono.fromRunnable(() -> ListBusiness.add(business));
    }

    @Override
    public Flux<Business> findAll() {
        return Flux.fromIterable(ListBusiness);
    }

    @Override
    public Mono<Business> findById(String businessId) {
        return Flux.fromIterable(ListBusiness)
            .filter(clientPersonal -> clientPersonal.getId().equalsIgnoreCase(businessId))
            .next();
    }

    @Override
    public Mono<Business> update(Business business) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Mono<Void> remove(String customerId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }
}
