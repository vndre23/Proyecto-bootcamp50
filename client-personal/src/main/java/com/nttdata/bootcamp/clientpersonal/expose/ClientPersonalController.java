package com.nttdata.bootcamp.clientpersonal.expose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.clientpersonal.model.ClientPersonal;
import com.nttdata.bootcamp.clientpersonal.repository.ClientPersonalRepository;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
public class ClientPersonalController {

    @Autowired
    ClientPersonalRepository clientPersonalRepository;

    @PostMapping("/api/personal")
    public Mono<Void> create(@RequestBody ClientPersonal clientPersonal) {
        return clientPersonalRepository.create(clientPersonal);
    }

    @GetMapping("/api/personal")
    public Flux<ClientPersonal> findAll() {
        log.info(" log ....");
        return clientPersonalRepository.findAll();
    }

    @GetMapping("/api/personal/{clientPersonalId}")
    public Mono<ClientPersonal> findById(@PathVariable("clientPersonalId") String id){
        return clientPersonalRepository.findById(id);
    }

}
