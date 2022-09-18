package com.omgdendi.soa_lab_1.repository;

import com.omgdendi.soa_lab_1.entity.AddressEntity;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepo extends CrudRepository<AddressEntity, Integer> {
}
