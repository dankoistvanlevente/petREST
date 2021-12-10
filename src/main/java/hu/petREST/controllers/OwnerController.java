package hu.petREST.controllers;

import hu.petREST.domain.Owner;
import hu.petREST.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwnerController {

    @Autowired
    private OwnerService service;

    @PostMapping("/owners")
    @ResponseStatus(HttpStatus.CREATED)
    public Owner addOwner(@RequestBody Owner owner){
        return service.addOwner(owner);
    }
}
