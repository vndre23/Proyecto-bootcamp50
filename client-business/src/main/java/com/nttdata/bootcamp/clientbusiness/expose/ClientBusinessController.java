package com.nttdata.bootcamp.clientbusiness.expose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.clientbusiness.model.ClientBusiness;
import com.nttdata.bootcamp.clientbusiness.repository.ClientBusinessRepository;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class ClientBusinessController {

    @Autowired
    ClientBusinessRepository clientBusinessRepository;

    @PostMapping("/api/business")
    public Mono<Void> create(@RequestBody ClientBusiness clientBusiness) {
        return clientBusinessRepository.create(clientBusiness);
    }

    @GetMapping("/api/business")
    public Flux<ClientBusiness> findAll() {
        log.info(" log ....");
        return clientBusinessRepository.findAll();
    }

    @GetMapping("/api/business/{clientBusinessId}")
    public Mono<ClientBusiness> findById(@PathVariable("clientBusinessId") String id){
        return clientBusinessRepository.findById(id);
    }

    @DeleteMapping("/api/business/{clientBusinessId}")
    public Mono<Void> deleteById(@PathVariable("clientBusinessId") String id){
        return clientBusinessRepository.remove(id);
    }
}
