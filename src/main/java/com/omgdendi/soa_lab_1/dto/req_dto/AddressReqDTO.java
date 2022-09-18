package com.omgdendi.soa_lab_1.dto.req_dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressReqDTO {

    @NotNull
    @Max(121)
    private String street;

    @Min(5)
    private String zipCode;

    @NotNull
    private LocationReqDto town;
}
