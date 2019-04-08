package hh.learning.hhpc.services;

import hh.learning.hhpc.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}
