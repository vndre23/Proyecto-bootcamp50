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

import com.nttdata.mscustomer.model.Personal;
import com.nttdata.mscustomer.repository.PersonalRepository;
import com.nttdata.mscustomer.service.PersonalService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/customers/personal")
public class PersonalController {

    @Autowired
    private PersonalService personalService;

    @PostMapping
    public Mono<ResponseEntity<Personal>> create(@RequestBody Personal personal) {
        return personalService.save(personal).map(p-> ResponseEntity.status(HttpStatus.CREATED).body(p));
        
    }

    @GetMapping
    public Mono<ResponseEntity<Flux<Personal>>> findAll() {
        return Mono.just(ResponseEntity.ok().body(personalService.findAll()));
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<Personal>> findById(@PathVariable("id") String id){
        return personalService.findById(id).map(p-> ResponseEntity.ok().body(p)).defaultIfEmpty(ResponseEntity.notFound().build());
    }

}
