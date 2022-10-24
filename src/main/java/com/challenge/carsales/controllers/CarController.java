package com.challenge.carsales.controllers;

import com.challenge.carsales.entities.Car;
import com.challenge.carsales.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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

    @PutMapping("update/{id}")
    public Car updateCar(@PathVariable Long id, @RequestBody Car car){
        return carService.updateCar(car, id);
    }

    @DeleteMapping("delete/{id}")
    public Optional<Car> deleteCar(@PathVariable Long id, @RequestBody Car car){
        return carService.deleteCar(car, id);
    }

    @GetMapping(value = "listarCarros")
    public ResponseEntity<List<Car>> listCar(){
        List<Car> car = carService.listCar();
        return new ResponseEntity<List<Car>>(car, HttpStatus.OK);

    }

}
