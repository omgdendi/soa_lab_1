package com.omgdendi.soa_lab_1.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "location")
@Data
public class LocationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "x")
    private double x;

    @Column(name = "y")
    @NotNull
    private Long y;

    @Column(name = "z")
    @NotNull
    private Float z;

    @Column(name = "name")
    @Size(min = 1)
    private String name;

    @OneToMany(mappedBy = "town", fetch = FetchType.LAZY)
    private List<AddressEntity> addresses = new ArrayList<AddressEntity>();
}
