package com.challenge.carsales.controller;

import com.challenge.carsales.entitie.Car;
import com.challenge.carsales.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/car/")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("{id}")
    public Optional<Car> getCarId(@PathVariable Long id) {
        return carService.findById(id);
    }

    @PostMapping("create")
    public ResponseEntity<Car> createdCar(@RequestBody Car car) {
        return ResponseEntity.ok().body(carService.createCar(car));
    }

}
