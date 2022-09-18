package com.omgdendi.soa_lab_1.repository;

import com.omgdendi.soa_lab_1.entity.CoordinatesEntity;
import org.springframework.data.repository.CrudRepository;

public interface CoordinatesRepo extends CrudRepository<CoordinatesEntity, Integer> {
}
