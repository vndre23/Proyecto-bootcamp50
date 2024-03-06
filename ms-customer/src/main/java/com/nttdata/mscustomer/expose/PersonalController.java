package com.nttdata.mscustomer.expose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.mscustomer.model.Personal;
import com.nttdata.mscustomer.repository.PersonalRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PersonalController {

    @Autowired
    private PersonalRepository personalRepository;

    @PostMapping("/api/customers/personal")
    public Mono<Void> create(@RequestBody Personal personal) {
        return personalRepository.create(personal);
        
    }

    @GetMapping("/api/customers/personal")
    public Flux<Personal> findAll() {
        return personalRepository.findAll();
    }

    @GetMapping("/api/customers/personal/{personalId}")
    public Mono<Personal> findById(@PathVariable("personalId") String personalId){
        return personalRepository.findById(personalId);
    }

}
