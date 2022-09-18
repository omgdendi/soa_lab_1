package com.omgdendi.soa_lab_1.dto.req_dto;

import com.omgdendi.soa_lab_1.entity.TicketTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketReqDTO {

    @NotNull
    @Size(min = 1)
    private String name;

    @NotNull
    private CoordinatesReqDTO coordinates;

    @Min(0)
    private double price;

    @NotNull
    @Min(0)
    @Max(100)
    private Integer discount;

    private TicketTypeEnum type;

    @NotNull
    private VenueReqDTO venue;
}
