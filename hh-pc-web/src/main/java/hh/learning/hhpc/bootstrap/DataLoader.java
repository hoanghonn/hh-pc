package hh.learning.hhpc.bootstrap;

import hh.learning.hhpc.model.Owner;
import hh.learning.hhpc.model.Vet;
import hh.learning.hhpc.services.OwnerService;
import hh.learning.hhpc.services.VetService;
import hh.learning.hhpc.services.map.OwnerServiceMap;
import hh.learning.hhpc.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("abc");
        owner1.setLastName("yoyo");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("abc2");
        owner2.setLastName("yoyo2");

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("abcd1");
        vet1.setLastName("yoyoyo1");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("abcd2");
        vet2.setLastName("yoyoyo2");

        vetService.save(vet2);

    }
}
