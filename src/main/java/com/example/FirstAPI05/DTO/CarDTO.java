package com.example.FirstAPI05.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {

    @NotBlank(message = "Mandatory")
    String id;

    @NotBlank(message = "Mandatory")
    String modelName;

    Double price;


    public CarDTO(CarDTO car) {
        this.id = car.id;
        this.modelName = car.modelName;
        this.price = car.price;
    }
}
