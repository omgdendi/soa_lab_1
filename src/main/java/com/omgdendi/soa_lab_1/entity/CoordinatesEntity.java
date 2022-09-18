package com.omgdendi.soa_lab_1.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "coordinates")
@Data
public class CoordinatesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "x")
    @NotNull
    @Min(-384)
    private Integer x;

    @Column(name = "y")
    @Min(-955)
    private Double y;

    @OneToMany(mappedBy = "coordinates", fetch = FetchType.LAZY)
    private List<TicketEntity> tickets = new ArrayList<TicketEntity>();
}
