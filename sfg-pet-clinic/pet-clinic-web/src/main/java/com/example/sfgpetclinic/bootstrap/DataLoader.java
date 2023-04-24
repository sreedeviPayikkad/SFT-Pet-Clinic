package com.example.sfgpetclinic.bootstrap;

import com.example.sfgpetclinic.model.Owner;
import com.example.sfgpetclinic.model.Vet;
import com.example.sfgpetclinic.services.OwnerService;
import com.example.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstname("Sreedevi");
        owner1.setLastname("Sasikumar");
        ownerService.save(owner1);
        System.out.println("loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstname("Doc");
        vet1.setLastname("PB");
        vetService.save(vet1);
        System.out.println("loaded vets...");


    }
}
