package com.omgdendi.soa_lab_1.dto.req_dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoordinatesReqDTO {
    @NotNull
    @Min(-384)
    private Long x;

    @Min(-955)
    private double y;
}