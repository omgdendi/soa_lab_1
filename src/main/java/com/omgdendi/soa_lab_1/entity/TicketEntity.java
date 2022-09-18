package com.omgdendi.soa_lab_1.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ticket")
@Data
public class TicketEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    @NotNull
    @Size(min = 1)
    private String name;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "coordinates_id")
    private CoordinatesEntity coordinates;

    @Column(name = "creatione_date", updatable = false)
    @CreatedDate
    @NotNull
    private java.time.LocalDateTime creationDate;

    @Column(name = "price")
    @Min(0)
    private Double price;

    @Column(name = "discount")
    @NotNull
    @Min(0)
    @Max(100)
    private Integer discount;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private TicketTypeEnum type;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "venue_id")
    private VenueEntity venue;
}
