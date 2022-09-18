package com.omgdendi.soa_lab_1.dto.req_dto;

import com.omgdendi.soa_lab_1.entity.VenueTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VenueReqDTO {

    @NotNull
    @Size(min = 1)
    private String name;

    @NotNull
    @Min(0)
    private Integer capacity;

    private VenueTypeEnum type;

    private AddressReqDTO address;
}
