package com.nttdata.mscustomer.expose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.mscustomer.model.Business;

import com.nttdata.mscustomer.repository.BusinessRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class BusinessController {

    @Autowired
    private BusinessRepository businessRepository;

    @PostMapping("/api/customers/business")
    public Mono<Void> create(@RequestBody Business business) {
        return businessRepository.create(business);
        
    }

    @GetMapping("/api/customers/business")
    public Flux<Business> findAll() {
        return businessRepository.findAll();
    }

    @GetMapping("/api/customers/personal/{businessId}")
    public Mono<Business> findById(@PathVariable("businessId") String businessId){
        return businessRepository.findById(businessId);
    }
}
