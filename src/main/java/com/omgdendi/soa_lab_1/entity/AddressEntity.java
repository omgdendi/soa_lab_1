package com.omgdendi.soa_lab_1.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "address")
@Data
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "street")
    @NotNull
    @Size(max = 121)
    private String street;

    @Column(name = "zip_code")
    @Size(min = 5)
    private String zipCode;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_id")
    private LocationEntity town;

    @OneToMany(mappedBy = "address", fetch = FetchType.LAZY)
    private List<VenueEntity> venues = new ArrayList<VenueEntity>();
}
