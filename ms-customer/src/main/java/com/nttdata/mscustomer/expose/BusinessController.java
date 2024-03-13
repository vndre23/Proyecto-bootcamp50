package com.nttdata.mscustomer.expose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.mscustomer.model.Business;
import com.nttdata.mscustomer.service.BusinessService;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/customers/business")
public class BusinessController {

    @Autowired
    private BusinessService businessService;

    @PostMapping
    public Mono<ResponseEntity<Business>> create(@RequestBody Business business) {
        return businessService.save(business).map(p-> ResponseEntity.status(HttpStatus.CREATED).body(p));
        
    }

    @GetMapping
    public Mono<ResponseEntity<Flux<Business>>> findAll() {
        return Mono.just(ResponseEntity.ok().body(businessService.findAll()));
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<Business>> findById(@PathVariable("id") String id){
        return businessService.findById(id).map(p-> ResponseEntity.ok().body(p)).defaultIfEmpty(ResponseEntity.notFound().build());
    }
}
