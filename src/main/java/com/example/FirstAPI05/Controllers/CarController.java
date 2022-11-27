package com.example.FirstAPI05.Controllers;


import com.example.FirstAPI05.DTO.CarDTO;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("")
public class CarController {

    @PostMapping("/cars")
    public String postCar(@Valid @RequestBody CarDTO car){
        System.out.println("Car body: " + car.toString());
        return "HTTP request: success";
    }

    @GetMapping("/cars")
    public String getCars(@Valid @RequestBody CarDTO car){
        return car.toString();
    }

}
