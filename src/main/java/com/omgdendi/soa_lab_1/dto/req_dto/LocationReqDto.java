package com.omgdendi.soa_lab_1.dto.req_dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocationReqDto {

    private double x;

    @NotNull
    private Long y;

    @NotNull
    private Float z;

    @Size(min = 1)
    private String name;
}
