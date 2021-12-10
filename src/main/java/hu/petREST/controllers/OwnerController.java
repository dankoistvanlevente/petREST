package hu.petREST.controllers;

import hu.petREST.domain.Owner;
import hu.petREST.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwnerController {

    @Autowired
    private OwnerService service;

    @PostMapping("/owners")
    public Owner addOwner(@RequestBody Owner owner){
        return service.addOwner(owner);
    }
}
