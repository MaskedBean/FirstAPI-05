package com.example.FirstAPI05.DTO;

import lombok.Data;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Data
@ToString
public class CarDTO {

    @NotBlank(message = "Mandatory")
    String id;

    @NotBlank(message = "Mandatory")
    String modelName;

    Double price;


}
