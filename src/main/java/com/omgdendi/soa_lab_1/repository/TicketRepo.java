package com.omgdendi.soa_lab_1.repository;

import com.omgdendi.soa_lab_1.entity.TicketEntity;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepo extends CrudRepository<TicketEntity, Integer> {
}
