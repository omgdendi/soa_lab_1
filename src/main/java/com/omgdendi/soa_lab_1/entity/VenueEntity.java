package com.omgdendi.soa_lab_1.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "venue")
@Data
public class VenueEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "capacity")
    @NotNull
    @Min(0)
    private Integer capacity;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private VenueTypeEnum type;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private AddressEntity address;

    @OneToMany(mappedBy = "venue", fetch = FetchType.LAZY)
    private List<TicketEntity> tickets = new ArrayList<TicketEntity>();
}
