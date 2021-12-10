package hu.petREST.services;

import hu.petREST.domain.Owner;
import hu.petREST.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository repository;

    public Owner addOwner(Owner owner) {
        return repository.save(owner);
    }
}
