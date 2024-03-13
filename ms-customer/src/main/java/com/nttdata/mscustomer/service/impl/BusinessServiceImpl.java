package com.nttdata.mscustomer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.mscustomer.model.Business;
import com.nttdata.mscustomer.repository.BusinessRepository;
import com.nttdata.mscustomer.service.BusinessService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BusinessServiceImpl implements BusinessService{

    @Autowired
    private BusinessRepository businessRepository;

    @Override
    public Flux<Business> findAll() {
        return businessRepository.findAll();
    }

    @Override
    public Mono<Business> findById(String id) {
       return businessRepository.findById(id);
    }

    @Override
    public Mono<Business> save(Business business) {
        return businessRepository.save(business);
    }

    @Override
    public Mono<Business> update(String id, Business business) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Mono<Void> delete(String id) {
        return businessRepository.deleteById(id);
    }

}
