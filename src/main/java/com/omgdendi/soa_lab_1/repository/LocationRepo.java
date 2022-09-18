package com.omgdendi.soa_lab_1.repository;

import com.omgdendi.soa_lab_1.entity.LocationEntity;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepo extends CrudRepository<LocationEntity, Integer> {
}
